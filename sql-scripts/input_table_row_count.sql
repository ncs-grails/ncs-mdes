/*************************************************************************************
 *
 * The code in this application 
 * 
 * 
 * 
 * 
 *************************************************************************************/





/*************************************************************************************
 * CREATE MAIN TABLE
 * This table will contain row counts per table (row) per database (column)
 *************************************************************************************/

/*
Use ncs_mdes_prod;
CREATE TABLE table_row_count (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    version BIGINT NOT NULL DEFAULT 0, 
    table_name VARCHAR(50) NOT NULL
);
*/

-- Remove Main Table
/*
Use ncs_mdes_prod;
DROP TABLE table_row_count;
*/

/*
Use ncs_mdes_prod;
SELECT * FROM table_row_count;
*/


/*************************************************************************************
 * CREATE COLUMN IN MAIN TABLE
 * Each column represents a database
 *************************************************************************************/

/*
Use ncs_mdes_prod;
ALTER TABLE table_row_count ADD COLUMN ncs_mdes_prod INT;
ALTER TABLE table_row_count ADD COLUMN ncs_mdes_6_04 INT;
*/

-- Remove Column from Main Table
/*
Use ncs_mdes_prod;
ALTER TABLE table_row_count DROP COLUMN t2;
*/


/*************************************************************************************
 * INPUT ROW COUNTS INTO MAIN TABLE 
 * This stored procedure inputs row counts per table per databse.  You must enter the 
 * name of the database, for which the row count is for, in the stored procedure's 
 * CALL statement below.
 *************************************************************************************/

Use ncs_mdes_prod;

DELIMITER $$

DROP PROCEDURE IF EXISTS input_table_row_count $$

CREATE PROCEDURE input_table_row_count(IN dbOfInterest varchar(50))

BEGIN

    DECLARE _done               tinyint             DEFAULT 0;
    DECLARE _tableName          varchar(60);
    DECLARE _tableNameExists    tinyint;
    DECLARE _rowCountToInput    int                 DEFAULT 0;

    -- cursor pulls table names from db of interest
    DECLARE c CURSOR FOR 
        SELECT table_name 
        FROM information_schema.tables 
        WHERE table_schema = dbOfInterest 
            AND table_type = 'BASE TABLE' 
            AND table_name != 'table_row_count';

	DECLARE CONTINUE HANDLER FOR NOT FOUND SET _done = 1;
    
    OPEN c;

        REPEAT 

            -- SELECT dbOfInterest;
            
            -- get table name from db of interest
            FETCH c INTO _tableName;
            -- SELECT _tableName;

            -- determine if the table name, from cursor, already exists in main table
            SELECT COUNT(*) INTO _tableNameExists 
            FROM table_row_count 
            WHERE table_name = _tableName;
            -- SELECT _tableNameExists;

            -- if table name does not already exist, insert that name into main table
            IF _tableNameExists = 0 THEN
                INSERT INTO table_row_count (table_name) 
                VALUES (_tableName);
            END IF; 

            SET @qry = CONCAT('SET @rowCount = (SELECT COUNT(*) FROM ', dbOfInterest, '.', _tableName, ')');
            -- SELECT @qry;
            PREPARE stmt FROM @qry;
            EXECUTE stmt;
            DEALLOCATE PREPARE stmt;

            SET _rowCountToInput = @rowCount;
            -- SELECT _rowCountToInput;

            IF _rowCountToInput IS NOT NULL OR _rowCountToInput != '' or _rowCountToInput > 0 THEN
                -- SELECT _rowCountToInput;
                SET @qry = CONCAT('UPDATE table_row_count SET ', dbOfInterest, ' = ', _rowCountToInput, ' WHERE table_name = ', QUOTE(_tableName));
                -- SELECT @qry;
                PREPARE stmt FROM @qry;
                EXECUTE stmt;
                DEALLOCATE PREPARE stmt;
            END IF;

        UNTIL _done END REPEAT;

    CLOSE c;

END 

$$

DELIMITER ;

CALL input_table_row_count('ncs_mdes_prod');


-- SELECT * FROM ncs_mdes_prod.table_row_count;
-- DELETE FROM ncs_mdes_prod.table_row_count WHERE table_name != '';
-- UPDATE table_row_count set ncs_mdes_prod = 10 where table_name = 'address'
