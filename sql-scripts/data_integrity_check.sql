Use ncs_mdes_prod;

/*************************************************************************************
 * TABLES IN DB
 *************************************************************************************/

-- number of  tables in db (n=268)
select count(*) from information_schema.tables where table_schema = 'ncs_mdes_prod';

-- row count per table  in db
select table_name, table_rows from information_schema.tables where table_schema = 'ncs_mdes_prod';
select table_name, table_rows from information_schema.tables where table_schema = 'ncs_mdes_prod' order by table_rows desc;

-- detail of table structure per table in db
select * from information_schema.tables where table_schema = 'ncs_mdes_prod';

-- code list
show columns from xsd_enumeration_definition;
select * from xsd_enumeration_definition;

-- DATA ISSUE: mysql does not have a built in IsDate function. May need to build one or is this part of the import process since it is using grails?
-- SUGGUESTIONS: 
    -- build views for comprehensives lists
    -- check links to other tables

/*************************************************************************************
 *
 * 		PARTICIPANTS
 *
 * 		Person: 
 * 				participant
 * 				link_person_participant
 *				person
 * 				person_race,
 * 				
 * 		Address/Telephone/Email: 
 * 				address 
 * 				email
 * 				telephone
 * 		
 * 		Pregnancy/Probability Group: 
 * 				ppg_details
 * 				ppg_status_history
 *
 *************************************************************************************/



/*************************************************************************************
 * table: participant
 *************************************************************************************/

show columns from participant;
select count(*) n from participant;
select * from participant;


-- PSU_ID ---------------------------------------------------------------------------


-- psu_id frequency
select p.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where type_name = 'psu_cl1'
group by p.psu_id;


-- P_ID -----------------------------------------------------------------------------


-- multiple p_ids? 
select * 
from 
	( 
		select p_id, count(*) n 
		from participant 
		group by p_id 
	) p 
where p.n > 1;	


-- P_TYPE & P_TYPE_OTH --------------------------------------------------------------


-- p_type code list (-5 = Other, -4 = Missing in Error) 
select * 
from xsd_enumeration_definition 
where type_name = 'participant_type_cl1'
order by value;


-- p_type combine list (p_type & p_type_oth) frequency
    -- p_type code (-5 = Other, -4 = Missing in Error)
    -- p_type_oth (-7 = 'Not Applicable')
select x.p_type as p_type_value,
   d.label as p_type_description,
   p_type_oth,
   count(*) as n
from participant x left outer join
   xsd_enumeration_definition d on x.p_type = d.value
where d.type_name = 'participant_type_cl1'
group by x.p_type, p_type_oth
order by x.p_type;


-- p_type view
    -- p_type code (-5 = Other, -4 = Missing in Error)
    -- p_type_oth (-7 = 'Not Applicable')
alter view pType as
select x.p_id,
    if(x.p_type < 0 and x.p_type_oth != -7, x.p_type_oth, convert(x.p_type, char)) as p_type_value,
    if(x.p_type < 0 and x.p_type_oth != -7, x.p_type_oth, d.label) as p_type_description,
  p_type_oth
from participant x left outer join
    xsd_enumeration_definition d on x.p_type = d.value
where d.type_name = 'participant_type_cl1';


-- p_type integrated list (p_type & p_type_oth) frequency
select p_type_value, p_type_description, p_type_oth, count(*) n
from pType
group by p_type_value, p_type_oth
order by p_type_value;
-- DATA ISSUE (reported): p_type of 
    -- NOT APPLICABLE (CODE = -7) (n=37)
    -- UNKNOWN (n=488)


-- TODO: does participant.p_type = 'NCS Child)'(6) match up with link_person_participant.relation = 'Child' (8)


-- TODO: how does participant.p_type (study eligibility) compare to ppg_details.ppg_pid_status?


-- STATUS_INFO_SOURCE & STATUS_INFO_SOURCE_OTH --------------------------------------


-- status_info_source code list
select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl4'
order by value;


-- status_info_source frequency
select p.status_info_source as status_info_source_value,
   d.label as status_info_source_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.status_info_source = d.value
where type_name = 'information_source_cl4'
group by p.status_info_source;


-- status_info_source_oth frequency
select status_info_source_oth as status_info_source_oth_value,
   case 
        when status_info_source_oth = -7 then 'Not Applicable' 
        else status_info_source_oth 
    end as status_info_source_oth_description,
    count(*) n
from participant
group by status_info_source_oth;


-- status_info_source comprehensive list (status_info_source + status_info_source_oth)
select status_info_source_value, status_info_source_description, count(* ) n
from
	(
		select 
			case 
				when status_info_source < 0 then status_info_source_oth
				else convert(status_info_source, char(2))
			end as status_info_source_value,
			case 
				when status_info_source < 0 then 
					(
						case 
							when status_info_source_oth = -7 then 'Not Applicable'
							else status_info_source_oth
						end
					)
				else d.label 
			end as status_info_source_description
		from participant p left outer join
		   xsd_enumeration_definition d on p.status_info_source = d.value
		where type_name = 'information_source_cl4'
		order by d.value
	) p
group by status_info_source_value, status_info_source_description;


-- TODO: participant with a negative status (status_info_source + status_info_source_oth) 


-- STATUS_INFO_MODE & STATUS_INFO_MODE_OTH -------------------------------------------


-- status_info_mode code list
select *
from xsd_enumeration_definition 
where type_name = 'contact_type_cl1'
order by value;


-- status_info_mode frequency
select p.status_info_mode as status_info_mode_value,
   d.label as status_info_mode_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.status_info_mode = d.value
where type_name = 'contact_type_cl1'
group by p.status_info_mode;


-- status_info_mode_oth
select status_info_mode_oth as status_info_mode_oth_value,
   case
       when status_info_mode_oth = -7 then 'Not Applicable'
       else status_info_mode_oth
   end as status_info_mode_oth_description,
   count(*) n
from participant
group by status_info_mode_oth;


-- status_info_mode compreshensive list (status_info_mode + status_info_mode_oth)
select status_info_mode_value, status_info_mode_description, count(* ) n
from
	(
		select 
			case 
				when status_info_mode < 0 then status_info_mode_oth
				else convert(status_info_mode, char(2))
			end as status_info_mode_value,
			case 
				when status_info_mode < 0 then 
					(
						case 
							when status_info_mode_oth = -7 then 'Not Applicable'
							else status_info_mode_oth
						end
					)
				else d.label 
			end as status_info_mode_description
		from participant p left outer join
		   xsd_enumeration_definition d on p.status_info_mode = d.value
		where type_name = 'contact_type_cl1'
		order by d.value
	) p
group by status_info_mode_value, status_info_mode_description;


-- TODO: list any status_info_mode code that is negative in comprehensive list (status_info_mode + status_info_mode_oth)


-- STATUS_INFO_DATE -----------------------------------------------------------------


-- status_info_date frequency
select status_info_date, count(*) n 
from participant 
group by status_info_date 
order by count(*) desc;


-- which participant does not have a status_info_date?
select p_id
from participant 
where status_info_date is null or status_info_date = '';


-- ENROLL_STATUS --------------------------------------------------------------------


-- enroll_status code list
select * 
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- enroll_status frequency
select p.enroll_status as enroll_status_value,
   d.label as enroll_status_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.enroll_status = d.value
where type_name = 'confirm_type_cl2'
group by p.enroll_status;


-- ENROLL_DATE ----------------------------------------------------------------------


-- enroll_date frequency
select enroll_date, count(*) n 
from participant 
group by enroll_date 
order by count(*) desc;
-- DATA ISSUE (reported): 3485 with date of 9777-97-97


-- TODO: verify that all ENROLL_DATE a legitimate date


-- participant with ENROLL_STATUS = yes (1), is missing ENROLL_DATE or has an invalid ENROLL_DATE
select p_id, enroll_status, enroll_date 
from participant 
where enroll_status = 1 and (enroll_date is null or enroll_date = '' or enroll_date = '9777-97-97');


-- participant with ENROLL_STATUS = no (2), but has an ENROLL_DATE
select p_id, enroll_status, enroll_date
from participant 
where enroll_status = 2 and (not enroll_date is null or enroll_date != '');


-- PID_ENTRY & PID_ENTRY_OTHER ------------------------------------------------------


-- pid_entry code list
select *
from xsd_enumeration_definition d 
where type_name = 'study_entry_method_cl1'
order by value;


-- pid_entry frequency
select p.pid_entry as pid_entry_value,
   d.label as pid_entry_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.pid_entry = d.value
where type_name = 'study_entry_method_cl1'
group by p.pid_entry;


-- pid_entry_other frequency

select pid_entry_other as pid_entry_other_value,
   case
       when pid_entry_other = -7 then 'Not Applicable'
       else pid_entry_other
   end as pid_entry_other_description,
   count(*) n
from participant
group by pid_entry_other;


-- ANALYSIS: pid_entry compreshensive list (pid_entry + pid_entry_other)
select pid_entry_value, pid_entry_description, count(* ) n
from
	(
		select 
			case 
				when pid_entry < 0 then pid_entry_other
				else convert(pid_entry, char(2))
			end as pid_entry_value,
			case 
				when pid_entry < 0 then 
					(
						case 
							when pid_entry_other = -7 then 'Not Applicable'
							else pid_entry_other
						end
					)
				else d.label 
			end as pid_entry_description
		from participant p left outer join
		   xsd_enumeration_definition d on p.pid_entry = d.value
		where type_name = 'study_entry_method_cl1'
		order by d.value
	) p
group by pid_entry_value, pid_entry_description;
-- DATA ISSUE (reported): for 3778/3853 participants, their p_entry/p_entry_other is -7 (Not Applicable) 


-- PID_AGE_ELIG ---------------------------------------------------------------------

-- pid_age_elig frequency
select p.pid_age_elig as pid_age_elig_value,
   d.label as pid_age_elig_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.pid_age_elig = d.value
where type_name = 'age_eligible_cl2'
group by p.pid_age_elig
order by p.pid_age_elig;
-- DATA ISSUE: why do some participants pid_age_elig is 
-- 'Not Applicable' (n=75), 
-- 'Unknown' (n=16)
-- 'Missing in Error' (n=15)
-- 'Over Age 49' (n=3)
-- 'Ineligible - Younger than age of Majority' (n=1)
-- Is it because participant is not a pregnant women, but rather, the child, father, etc.


-- does participant's p_type corroborate with pid_age_elig (e.g., father would have pid_age_elig of "Not Applicable")
select p.p_type, p_type_description,
    p.pid_age_elig, d.label as pid_age_elig_description,
    p.n
from
    (
        select p.p_type, d.label as p_type_description, p.pid_age_elig, p.n
        from
            (
                select p_type, pid_age_elig, count(p_id) n
                from participant
                group by p_type, pid_age_elig
            ) p left outer join
           xsd_enumeration_definition d on p.p_type = d.value
        where d.type_name = 'participant_type_cl1'
    ) p left outer join
    xsd_enumeration_definition d on p.pid_age_elig = d.value
where d.type_name = 'age_eligible_cl2'
order by p.p_type, p.pid_age_elig;


-- TODO: does participant's dob corroborate with PID_AGE_ELIG?


-- PID_COMMENT ----------------------------------------------------------------------


-- pid_comment frequency
select pid_comment, count(*) n
from participant
group by pid_comment;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type as transaction_type_value,
    case 
        when transaction_type = 'UP' then 'Upsert'
        when transaction_type = 'D' then 'Delete'
        when transaction_type = 'NA' then 'Not Applicable'
        else 'ERROR -needs resolution'
    end as transaction_type_description,
    count(*) n
from participant
group by transaction_type;



/*************************************************************************************
 * table; link_person_participant
 *************************************************************************************/

show columns from link_person_participant;
select count(*) n from link_person_participant;


-- PSU_ID ---------------------------------------------------------------------------

-- count frequency
select l.psu_id as psu_id_value, d.label as psu_id_description, count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.psu_id = d.value
where type_name = 'psu_cl1'
group by l.psu_id;


-- PERSON_PID_ID --------------------------------------------------------------------

-- person_pid_id frequency
select person_pid_id, count(*) n
from link_person_participant 
group by person_pid_id;

-- person_pid_id is not unique
select *
from 
    ( 
        select person_pid_id, count(*) n 
        from link_person_participant  
        group by person_pid_id 
    ) l
where l.n > 1;


-- P_ID -----------------------------------------------------------------------------


-- p_id frequency
select p_id, count(*) n 
from link_person_participant 
group by p_id 
order by count(*) desc;


-- p_id is not unique 
select l.p_id, l.n
from
    (
        select p_id, count(*) n 
        from link_person_participant 
        group by p_id 
        order by count(*) desc
    ) l
where l.n > 1;

-- p_id is null
select p_id, count(*) n 
from link_person_participant 
where p_id is null
group by p_id ;


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) n
from link_person_participant 
group by person_id 
order by count(*) desc; 


-- person_id is null
select person_id
from link_person_participant 
where person_id is null
order by person_id; 


-- person_id is not unique
select l.person_id, l.n
from
    (
        select person_id, count(*) n
        from link_person_participant 
        group by person_id 
    ) l
where l.n > 1; 


-- RELATION & RELATION_OTH ----------------------------------------------------------


-- relation
select l.relation as relation_value,
   d.label as relation_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.relation = d.value
where type_name = 'person_partcpnt_reltnshp_cl1'
group by l.relation;

-- relation_oth
select relation_oth as relation_oth_value,
   case
       when relation_oth = -7 then 'Not Applicable'
       else relation_oth
   end as relation_oth_description,
   count(*) n
from link_person_participant
group by relation_oth;


-- relation compreshensive list (relation + relation_oth)
select relation_value, relation_description, count(* ) n
from
	(
		select 
			case 
				when relation < 0 then relation_oth
				else convert(relation, char(2))
			end as relation_value,
			case 
				when relation < 0 then 
					(
						case 
							when relation_oth = -7 then 'Not Applicable'
							else relation_oth
						end
					)
				else d.label 
			end as relation_description
		from link_person_participant p left outer join
		   xsd_enumeration_definition d on p.relation = d.value
		where type_name = 'person_partcpnt_reltnshp_cl1'
		order by d.value
	) p
group by relation_value, relation_description;
-- DATA ISSUE (reported): 9 person to p_id relationship are 'Not Applicable'


-- IS_ACTIVE ------------------------------------------------------------------------


-- is_active frequency
select l.is_active as is_active_value,
   d.label as relation_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where type_name = 'confirm_type_cl2'
group by l.is_active;


-- person_participant link is NOT ACTIVE or NULL
select l.is_active as is_active_value,
   d.label as relation_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where type_name = 'confirm_type_cl2' 
	and l.is_active != 1 or l.is_active is null
group by l.is_active;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type as transaction_type_value,
    case 
        when transaction_type = 'UP' then 'Upsert'
        when transaction_type = 'D' then 'Delete'
        when transaction_type = 'NA' then 'Not Applicable'
        else 'ERROR -needs resolution'
    end as transaction_type_description,
    count(*) n
from link_person_participant
group by transaction_type;


/*************************************************************************************
 * table: person
 *************************************************************************************/

show columns from person;
select count(*) n from person;

-- DATA ISSUE: according to Master Data Elements document, under the "Format Constraint" column, 
    -- the FIRST_NAME, LAST_NAME, MIDDLE_NAME, & MIDDLE_NAME "is considred PII and should be left 
    -- NULL or contain the following values: -7 (Not Applicable) which is not the case in the database.


-- PSU_ID ---------------------------------------------------------------------------


-- psu_id frequency
select p.psu_id as psu_id_value, d.label as psu_id_description, count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where type_name = 'psu_cl1'
group by p.psu_id;


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) 
from person 
group by person_id;
-- DATA ISSUE (reported): 
	-- odd person_ids (-3 and -7)
	-- why are some ids numeric only (1958907), while others are alphanumeric with a date appended (C7312012-02-24)?


-- person_id is not unique
select *
from (
  select person_id, count(*) n
  from person
  group by person_id
) p
where p.n > 1;


-- PREFIX ---------------------------------------------------------------------------


-- prefix code list
select * 
from xsd_enumeration_definition 
where type_name = 'name_prefix_cl1';


-- prefix frequency
select p.prefix as prefix_value, 
	d.label as prefix_description, 
	count(p.id) as n
from person p left outer join
	xsd_enumeration_definition d on p.prefix = d.value
where d.type_name = 'name_prefix_cl1'
group by prefix;
-- DATA ISSUE (reported): all prefixes are "NA"


-- FIRST_NAME -----------------------------------------------------------------------
-- ISSUE: should quality checks only focus on names of persons listed in participant table?

-- first_name frequency
select first_name, count(*) n 
from person 
group by first_name 
order by first_name;
-- DATA ISSUES (reported): firstnames that are
	-- null (n=3900)
	-- '-3' (n=22)
	-- '26' (n=1)
	-- '30' (n=1)


-- first_name is null
select first_name, count(*) n
from person 
where first_name is null or first_name = '';
-- DATA ISSUE (reported): 3900 rows with null first_name


-- if first_name is null, what is person's middle and lastname
select first_name, middle_name, last_name, count(*) n
from person 
where first_name is null
group by middle_name, last_name;
-- DATA ISSUE: of 390 null first names, most do not have a middle or last name


-- first name has odd non-alpha characters (excludes single quote, hyphen, space)
select p.first_name, count(*) n
from
   (
		select id, first_name
		from person
		where first_name not REGEXP "^[A-Za-z\\'\\ \\-]+$" 
   ) p
group by p.first_name;
-- DATA ISSUE (reported): first name has parenthesis, period, comma, slash, and number


-- first name contains a period (suggesting person has middle name) yet person also has middle
select id, first_name,  middle_name
from person
where  first_name REGEXP '[.]' and middle_name != -7;


-- LAST_NAME ------------------------------------------------------------------------


-- last_name frequency
select last_name, count(*) n 
from person 
group by last_name;


-- last name is null
select person_id, last_name, first_name, middle_name 
from person 
where last_name is null;
-- DATA ISSUE (reported): 3 last names that are null


-- odd last names (excludes single quote, space and hypen)
select p.last_name, count(*) n
from
   (
		select person_id, last_name
		from person
		where last_name not REGEXP "^[A-Za-z\\'\\ \\-]+$" 
   ) p
group by p.last_name;


-- MIDDLE NAME ----------------------------------------------------------------------
-- (-7 means 'not applicable')


-- middle_name frequency
select middle_name, count(*) n 
from person 
group by middle_name;


-- middle name is null
select count(*) n 
from person 
where middle_name is null;


-- middle name is null (detailed list)
select person_id, middle_name 
from person 
where middle_name is null;


-- middle names that have odd non-alpha characters (excludes single quote, hyphen, space, period)
select p.middle_name, count(*) n
from
   (
		select id, middle_name
		from person
		where middle_name not REGEXP "^[A-Za-z\\'\\ \\-\\.]+$" and middle_name != -7
   ) p
group by p.middle_name;



-- MAIDEN NAME ----------------------------------------------------------------------
-- (-7 means 'not applicable')

-- maiden_name frequency 
select 
    case 
        when maiden_name = -7 then 'not applicable' 
        else maiden_name 
    end as maiden_name, count(*) n 
from person 
group by maiden_name;


-- maiden_name is null
select maiden_name, count(*) n 
from person 
where maiden_name is null;


-- SUFFIX ---------------------------------------------------------------------------


-- suffix frequency 
select suffix as suffix_value,
	d.label as suffix_description, 
   	count(*) n
from person p left outer join
   xsd_enumeration_definition d on p.suffix = d.value
where type_name = 'name_suffix_cl1'
group by suffix;


-- TITLE ----------------------------------------------------------------------------


-- title frequency
select title as title_code,
	case when title = -7 then 'Not Applicable' else title end as title_description,
	count(*) n
from person
group by title;


-- SEX ------------------------------------------------------------------------------


-- sex frequency
select p.sex as sex_value, 
    d.label as sex_description, 
    count(*) n
from person p left outer join
   xsd_enumeration_definition d on p.sex = d.value
where type_name = 'gender_cl1'
group by p.sex, d.label;


-- participant has UNKNOWN gender
select a.p_type_value, a.p_type_description, count(*) n
from
    (
        select p.person_id, par.p_id, par.p_type_value, par.p_type_description, p.sex
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            (
                select p.p_id, p.p_type as p_type_value,
                   d.label as p_type_description
                from participant p left outer join
                   xsd_enumeration_definition d on p.p_type = d.value
                where type_name = 'participant_type_cl1'
            ) par on l.p_id = par.p_id 
        where p.sex = -6
    ) a
group by a.p_type_value, a.p_type_description;


-- AGE ------------------------------------------------------------------------------


-- age frequency
select a.age, 
    case
        when a.age = -6 then 'Unknown'
        when a.age = -4 then 'Missing in Error'
        when a.age = -1 then 'Refused'
        else convert(a.age, char(2))
    end as age_description, 
    a.n
from
    (
        select age, count(*) n 
        from person 
        group by age
    ) a
;


-- participant has 0 (zero) age
select a.p_type_value, a.p_type_description, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' and p.age = -1
    ) a
where a.age = 0
group by a.p_type_value, a.p_type_description;


-- participant that REFUSED age 
select a.p_type_value, a.p_type_description, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' and p.age = -1
    ) a
where a.age = -1
group by a.p_type_value, a.p_type_description;
-- DATA ISSUE: the following participant p_type refused age
    -- Other
    -- Missing in Error
    -- Age-eligible women, ineligible for pre-pregnancy visit - being followed
    -- High_Trier - eligible for Pre-Pregnancy Visit


-- participant has UNKNOWN age 
select a.p_type_value, a.p_type_description, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' and p.age = -1
    ) a
where a.age = -6
group by a.p_type_value, a.p_type_description;


-- participant has MISSING IN ERROR age
select a.p_type_value, a.p_type_description, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' and p.age = -1
    ) a
where a.age = -4
group by a.p_type_value, a.p_type_description;


-- AGE RANGE ------------------------------------------------------------------------


-- age_range code list
select * 
from xsd_enumeration_definition 
where type_name = 'age_range_cl1'
order by value;


-- age_range frequency
select p.age_range as age_range_value, d.label as age_range_description, p.n
from
   (
       select age_range, count(*) n
       from person
       group by age_range
       order by age_range
   ) p left outer join
   xsd_enumeration_definition d on p.age_range = d.value
where type_name = 'age_range_cl1'
order by p.age_range ;


-- TODO: does age range corroborate with person's dob?


-- PERSON_DOB -----------------------------------------------------------------------

-- person_dob (-1 = Refused, -6 Unknown) frequency
select person_dob, count(*) n
from person
group by person_dob;


-- TODO: which participants have an UNKNOWN person_dob
select *
from person
where person_dob like '%96%'
-- where person_dob REGEXP '96+'
; 

-- TODO: COMPARE AGE, AGE_RAGE AND PERSON_DOB ----------------------------------------


-- DECEASED -------------------------------------------------------------------------

-- deceased code list
select *
from xsd_enumeration_definition
where type_name = 'confirm_type_cl2';


-- deceased frequency
select p.deceased as deceased_value, 
    d.label as deceased_description, 
    p.n
from
   (
       select deceased, count(*) n
       from person
       group by deceased
   ) p left outer join
   xsd_enumeration_definition d on p.deceased = d.value
where type_name = 'confirm_type_cl2';


-- TODO: of those decesed and UNKNOWN deceased, which are participants.


-- ETHNIC GROUP ---------------------------------------------------------------------


-- ethnic_group code list
select * 
from xsd_enumeration_definition 
where type_name = 'ethnicity_cl1'
order by value;


-- ethnic_group frequency
select p.ethnic_group as ethnic_group_value,
   d.label as ethnic_group_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.ethnic_group = d.value
where d.type_name = 'ethnicity_cl1'
group by p.ethnic_group;
-- DATA ISSUE (reported): is 66% (6270/9515) UNKNOWN acceptable for ethnic group


-- PERSON_LANG ----------------------------------------------------------------------

select p.person_lang as person_lang_value,
   d.label as person_lang_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.person_lang = d.value
where type_name = 'language_cl2'
group by p.person_lang;


-- PERSON_LANG_OTH ------------------------------------------------------------------

select case 
        when person_lang_oth = -7 then 'NOT APPLICABLE'
        else person_lang_oth 
    end as person_lang_oth_value, 
    count(*)
from person
group by person_lang_oth;
-- DATA ISSUE (reported): what is person_lang_oth = -2


-- TODO: PERSON_LANG & PERSON_LANG_OTH comparison -----------------------------------


-- MARISTAT & MARISTAT_OTH ----------------------------------------------------------


-- maristat code list
select *
from xsd_enumeration_definition 
where type_name = 'marital_status_cl1'
order by value;


-- maristat frequency
select p.maristat as maristat_value,
   d.label as maristat_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.maristat = d.value
where type_name = 'marital_status_cl1'
group by p.maristat
order by p.maristat;


-- maristat_oth frequency
select maristat_oth as maristat_oth_value,
    case 
        when maristat_oth = -7 then 'Not Applicable' 
        else maristat_oth end as maristat_oth_description,
    count(*) n
from person
group by maristat_oth;


-- TODO: what is maristat + maristat_oth of participants


-- PREF_CONTACT & PREF_CONTACT_OTH --------------------------------------------------


-- pref_contact code list
select *
from xsd_enumeration_definition 
where type_name = 'contact_type_cl1'
order by value;


-- pref_contact frequency
select p.pref_contact as pref_contact_value,
   d.label as pref_contact_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.pref_contact = d.value
where type_name = 'contact_type_cl1'
group by p.pref_contact;


-- pref_contact_oth frequency
select pref_contact_oth as pref_contact_oth_value,
    case 
        when pref_contact_oth = -7 then 'Not Applicable' 
        else pref_contact_oth 
    end as pref_contact_oth_description,
    count(*) n
from person
group by pref_contact_oth;


-- PLAN_MOVE, MOVE_INFO, NEW_ADDRESS_ID, WHEN_MOVE ----------------------------------


-- plan_move code list 
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl1'
order by value;


-- plan_move frequncy
select p.plan_move as plan_move_value,
   d.label as plan_move_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.plan_move = d.value
where type_name = 'confirm_type_cl1'
group by p.plan_move;


-- move_info code list
select *
from xsd_enumeration_definition 
where type_name = 'moving_plan_cl1'
order by value;


-- move_info frequncy
select p.move_info as move_info_value,
   d.label as move_info_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.move_info = d.value
where type_name = 'moving_plan_cl1'
group by p.move_info;


-- new_address_id
select new_address_id, count(*) n
from person
group by new_address_id;



-- when_move
select p.when_move as when_move_value,
   d.label as when_move_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.when_move = d.value
where type_name = 'confirm_type_cl4'
group by p.when_move;

-- date_move
select date_move, count(*) n
from person
group by date_move;


-- TODO: plan_move, move_info, new_address_id, when_move & date_move


-- P_TRACING, P_INFO_SOURCE, P_INFO_SOURCE_OTH, P_INFO_DATE, P_INFO_UPDATE ----------

-- p_tracing
select p.p_tracing as p_tracing_value,
   d.label as p_tracing_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.p_tracing = d.value
where type_name = 'confirm_type_cl2'
group by p.p_tracing;

-- p_info_source
select p.p_info_source as p_p_info_source_value,
   d.label as p_info_source_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.p_info_source = d.value
where type_name = 'information_source_cl4'
group by p.p_info_source;

-- p_info_source_oth
select p_info_source_oth as p_info_source_oth_value,
   case when p_info_source_oth = -7 then 'Not Applicable' else p_info_source_oth end as p_info_source_oth_description,
   count(*) n
from person
group by p_info_source_oth;

-- p_info_date
select p_info_date as p_info_date_value,
   count(*) n
from person
group by p_info_date;

-- p_info_update
select p_info_update as p_info_update_value,
   count(*) n
from person
group by p_info_update;

-- person_comment
select person_comment, count(*) n
from person
group by person_comment;

-- transaction_type
select transaction_type, count(*) n
from person
group by transaction_type;


/*************************************************************************************
 * table: person_race
 *************************************************************************************/

show columns from person_race;
select count(*) n from person_race;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) n
from person_race
group by psu_id
order by count(*) desc;

-- psu_id  is not correct
select * from
person_race
where psu_id != 20000048;

-- PERSON_ID ------------------------------------------------------------------------

select person_id, count(*)
from person_race
group by person_id
order by count(*) desc;


-- RACE & RACE_OTH ------------------------------------------------------------------

-- race

select r.race as race_value,
   d.label as race_description,
   count(r.id) as n
from person_race r left outer join
   xsd_enumeration_definition d on r.race = d.value
where type_name = 'race_cl1'
group by r.race;

-- race_oth

select race_oth as race_oth_value,
   case
       when race_oth = -7 then 'Not Applicable'
       else race_oth
   end as race_oth_description,
   count(*) n
from person_race
group by race_oth;

-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from person_race
group by transaction_type;


/*************************************************************************************
 * table: link_person_household
 *************************************************************************************/

show columns from link_person_household;
select count(*) n from link_person_household;
select * from link_person_household;


-- PSU_ID ---------------------------------------------------------------------------


-- psu_id frequency
select psu_id, count(*) n
from link_person_household
group by psu_id
order by count(*) desc;


-- PERSON_HH_ID ---------------------------------------------------------------------


-- person_hh_id is not unique
select *
from
    (
        select person_hh_id, count(*) n
        from link_person_household
        group by person_hh_id
        order by count(*) desc
    ) l
where l.n > 1;



-- PERSON_ID ------------------------------------------------------------------------


-- does person live in multiple households?
select *
from
    (
        select person_id, count(distinct hh_id) nhh_id
        from link_person_household
        group by person_id
        order by count(distinct hh_id) desc
    ) lph
where lph.nhh_id > 1;


-- HH_ID ---------------------------------------------------------------------


-- does household have multiple person_ids?
select *
from 
    (
        select hh_id, person_id, count(*) n
        from link_person_household
        group by hh_id, person_id
    ) lph
where lph.n > 1;


-- IS_ACTIVE ------------------------------------------------------------------------


-- is_active code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- is_active frequency
select l.is_active as is_active_value,
   d.label as is_active_description,
   count(l.id) as n
from link_person_household l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where type_name = 'confirm_type_cl2'
group by l.is_active;


-- HH_RANK & HH_RANK_oth ------------------------------------------------------------


-- hh_rank code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'communication_rank_cl1'
order by value;


-- hh_rank frequency
    -- hh_rank (-5 = Other, -4 = Missing in Error)
    -- hh_rank_oth (-7 = Not Applicable)
select l.hh_rank as hh_rank_value,
    d.label as hh_rank_description,
    hh_rank_oth, 
    count(l.id) as n
from link_person_household l left outer join
   xsd_enumeration_definition d on l.hh_rank = d.value
where type_name = 'communication_rank_cl1'
group by l.hh_rank
order by l.hh_rank;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from link_person_household
group by transaction_type;


/*************************************************************************************
 * table: address
 *************************************************************************************/

show columns from address;
select count(*) n from address;
select * from address limit 0,100;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) n
from address
group by psu_id
order by count(*) desc;

select a.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.psu_id = d.value
where type_name = 'psu_cl1'
group by a.psu_id;

-- psu_id  is not correct
select * from address where psu_id != 20000048;


-- ADDRESS_ID -----------------------------------------------------------------------


-- address_id frequency
select address_id, count(*) n 
from address 
group by address_id 
order by count(*) desc;

-- address_id is not unique
select * 
from
    (
        select address_id, count(*) n 
        from address 
        group by address_id 
    ) a
where a.n > 1;


-- PERSON_ID ------------------------------------------------------------------------

-- person_id in not unique
select *
from
    (
        select person_id, count(*) n 
        from address 
        group by person_id 
        order by count(*) desc
    ) a
where a.n > 1;
-- DATA ISSUE: is it possible for an address_id not linked to a person_id (30,752 have a null person_id)

-- select * from address where person_id = '60695801';


-- TODO: link person_id to external table


-- INSTITUTE_ID ---------------------------------------------------------------------


-- institute_id frequency
select institute_id, count(*) n 
from address 
group by institute_id 
order by count(*) desc;


-- PROVIDER_ID ---------------------------------------------------------------------

select provider_id, count(*) n 
from address 
group by provider_id 
order by count(*) desc;
-- DATA ISSUE (reported): what does provider_id of -3 and -7?


-- TODO: link provider_id to external table


-- DU_ID ----------------------------------------------------------------------------

select du_id, count(*) n 
from address 
group by du_id 
order by count(*) desc;
-- MDES ISSUE: what does a du_id of -7 (n=3900) mean?


-- TODO: link du_id to external table


-- ADDRESS_RANK & ADDRESS_RANK_OTH --------------------------------------------------


-- address_rank code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'communication_rank_cl1'
order by value;


-- address_rank frequency
    -- address_rank (-5 = Other, -4 = Missing in Error)
    -- address_rank_oth (-7 = Not Applicable)
select a.address_rank as address_rank_value,
   d.label as address_rank_description,
    address_rank_oth, 
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_rank = d.value
where type_name = 'communication_rank_cl1'
group by a.address_rank
order by a.address_rank;


-- ADDRESS_INFO_SOURCE & ADDRESS_INFO_SOURCE_OTH ------------------------------------


-- address_info_source code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl1'
order by value;


-- address_info_source frequency
    -- address_info_source (-5 = Other, -4 = Missing in Error)
    -- address_info_oth (-7 = Not Applicable)
select a.address_info_source as address_info_source_value,
   d.label as address_info_source_description,
    address_info_source_oth,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_info_source = d.value
where type_name = 'information_source_cl1'
group by a.address_info_source;


-- ADDRESS_INFO_MODE & ADDRESS_INFO_MODE_OTH ----------------------------------------


-- address_info_mode code list
select *
from xsd_enumeration_definition 
where type_name = 'contact_type_cl1'
order by value;


-- address_info_mode frequency
    -- address_info_mode (-5 = Other, -4 = Missing in Error)
    -- address_info_mode_oth (-7 = Not Applicable)
select a.address_info_mode as address_info_mode_value,
   d.label as address_info_mode_description,
    address_info_mode_oth, 
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_info_mode = d.value
where type_name = 'contact_type_cl1'
group by a.address_info_mode;


-- ADDRESS_INFO_DATE & ADDRESS_INFO_UPDATE ------------------------------------------


-- address_info_date frequency
select address_info_date, count(*) n
from address
group by address_info_date
order by address_info_date;


-- odd address_info_date
select address_info_date, count(*) n
from address
where address_info_date regexp '^9' or address_info_date regexp '-9+'
group by address_info_date
order by address_info_date;
-- DATA ISSUE: what is an address_info_date of 92 (n=1) and 97 (n=2) mean?


-- address_info_update frequency
select address_info_update, count(*) n
from address
group by address_info_update
order by address_info_update;


-- odd address_info_update
select address_info_update, count(*) n
from address
where address_info_update regexp '^9' or address_info_update regexp '-9+'
group by address_info_update
order by address_info_update;
-- DATA ISSUE: what is an address_info_update of 92 and 97 mean?


-- ADDRESS_START_DATE & ADDRESS_END_DATE --------------------------------------------


-- address_start_date frequency (6 = Unknown, 4 = Missing in Error)
select address_start_date, count(*) n
from address
group by address_start_date
order by count(*) desc;


-- address_end_date (6 = Unknown)
select address_end_date, count(*) n
from address
group by address_end_date
order by count(*) desc;


-- ADDRESS_TYPE & ADDRESS_TYPE_OTH --------------------------------------------------


-- address_type code list (-6 = Unknown, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'address_category_cl1'
order by value;


-- address_type frequency
    -- address_type (-6 = Unknown, -5 = Other, -4 = Missing in Error)
    -- address_type_oth (-7  = Not Applicable)
select a.address_type as address_type_value,
   d.label as address_type_description,
    address_type_oth, 
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_type = d.value
where type_name = 'address_category_cl1'
group by a.address_type;


-- ADDRESS_DESCRIPTION & ADDRESS_DESCRIPTION_OTH ------------------------------------


-- address_description code list
select *
from xsd_enumeration_definition 
where type_name = 'residence_type_cl1'
order by value;


-- address_description frequency
    -- address_description (-6 = Unknown, -5 = Other, -4 = Missing in Error)
    -- address_description_oth (-7 = Not Applicable)
select a.address_description as address_description_value,
   d.label as address_description_description,
    address_description_oth, 
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_description = d.value
where type_name = 'residence_type_cl1'
group by a.address_description;


-- ADDRESS_1, ADDRESS_2, UNIT, CITY, STATE, ZIP, ZIP4 -------------------------------

-- address_1 frequency
select address_1,
   case
       when address_1 = -1 then 'Refused'
       when address_1 = -2 then "Don't Know"
       when address_1 = -3 then 'Legitimate Skip'
       else ''
   end as note,
   count(*) n
from address
group by address_1
order by count(*) desc;

-- address_1 is REFUSED, DON'T KNOW, LEGITMATE SKIP
select address_1,
   case
       when address_1 = -1 then 'Refused'
       when address_1 = -2 then "Don't Know"
       when address_1 = -3 then 'Legitimate Skip'
       else ''
   end as note,
   count(*) n
from address
where address_1 in (-1, -2, -3)
group by address_1
order by count(*) desc;


-- address_2 frequency
select address_2,
   case
       when address_2 = -1 then 'Refused'
       when address_2 = -2 then "Don't Know"
       when address_2 = -3 then 'Legitimate Skip'
       else ''
   end as comment,
   count(*) n
from address
group by address_2
order by count(*) desc;
-- DATA ISSUE (reported): what does an address_2 of -7 (n=3584) and 8 (n=1) mean?


-- unit frequency
select unit,
   case
       when unit = -1 then 'Refused'
       when unit = -6 then "Unknown"
       when unit = -7 then 'Not Applicable'
       else ''
   end as comment,
   count(*) n
from address
group by unit
order by unit;
-- DATA ISSUE (reported): what does a unit of -3 (n=164) and -2 (n=1)


-- city frequency
select city, count(*) n
from address
group by city
order by city;
-- DATA ISSUE (reported): what does city of -2 (n=11), -3 (n=5) and -7 (n=12)


-- state code list (-6 = Unknown, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'state_cl1'
order by value;


-- state frequency (-6 = Unknown, -4 = Missing in Error)
select a.state as state_value,
   d.label as state_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.state = d.value
where type_name = 'state_cl1'
group by a.state
order by a.state;


-- zip
select zip, count(*) n
from address
group by zip
order by zip;
-- DATA ISSUE: what is a zip of -1 (n=8), -2 (n=115), and -3 (n=7)


-- zip4
select zip4, count(*) n
from address
group by zip4
order by zip4;
-- DATA ISSUE: wht is a zip4 of -1 (n=33), -2 (n=31), -3 (n=2) and -7 (n=457)


-- ADDRESS_COMMENT --------------------------------------------------------------------------
select address_comment, count(*) n
from address
group by address_comment
order by count(*) desc;
-- DATA ISSUE: what is an address_comment of -3 (n=2) mean?


-- TRANSACTION TYPE -------------------------------------------------------------------------
select transaction_type, count(*) n
from address
group by transaction_type;


/*************************************************************************************
 * table: email
 *************************************************************************************/

show columns from email;
select count(*) n from email;
select * from email;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) n
from email
group by psu_id
order by count(*) desc;

select e.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.psu_id = d.value
where type_name = 'psu_cl1'
group by e.psu_id;


-- EMAIL_ID -----------------------------------------------------------------------


-- email_id is not unique 
select *
from
    (
        select email_id, count(*) n 
        from email 
        group by email_id 
        order by email_id
    ) e
where e.n > 1;


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) n 
from email 
group by person_id 
order by count(*) desc;


-- INSTITUTE_ID ---------------------------------------------------------------------


-- institute_id frequency
select institute_id, count(*) n 
from email 
group by institute_id 
order by count(*) desc;


-- PROVIDER_ID ---------------------------------------------------------------------


-- provider_id frequency
select provider_id, count(*) n 
from email 
group by provider_id 
order by count(*) desc;


-- EMAIL_RANK & EMAIL_RANK_OTH ------------------------------------------------------


-- email_rank code list (-5 = Other, -4 = Missing in Error)
select * 
from xsd_enumeration_definition 
where type_name = 'communication_rank_cl1'
order by value;


-- email_rank combine list frequency
    -- email_rank (-5 = Other, -4 = Missing in Error)
    -- email_rank_oth (-7 = Not Applicable)
select e.email_rank as email_rank_value,
   d.label as email_rank_description,
    email_rank_oth,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_rank = d.value
where type_name = 'communication_rank_cl1'
group by e.email_rank;


-- EMAIL_INFO_SOURCE & EMAIL_INFO_SOURCE_OTH ----------------------------------------


-- email_info_source code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl1'
order by value;


-- email_info_source combine list frequency
    -- email_rank (-5 = Other, -4 = Missing in Error)
    -- email_rank_oth (-7 = Not Applicable)
select e.email_info_source as email_info_source_value,
   d.label as email_info_source_description,
    email_info_source_oth, 
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_info_source = d.value
where type_name = 'information_source_cl1'
group by e.email_info_source;


-- EMAIL_INFO_DATE & EMAIL_INFO_UPDATE ----------------------------------------------


-- email_info_date
select email_info_date, count(*) n
from email
group by email_info_date
order by email_info_date;


-- odd email_info_date
select email_info_date, count(*) n
from email
where email_info_date regexp '^9' or email_info_date regexp '-9+'
group by email_info_date
order by email_info_date;
-- DATA ISSUE: what is does email_info_date of 92 mean?


-- email_info_update
select email_info_update, count(*) n
from email
group by email_info_update
order by email_info_update;


-- odd email_info_update
select email_info_update, count(*) n
from email
where email_info_update regexp '^9' or email_info_update regexp '-9+'
group by email_info_update
order by email_info_update;
-- DATA ISSUE: what is does email_info_update of 97 mean?


-- EMAIL_TYPE & EMAIL_TYPE_OTH --------------------------------------------------


-- email_type code list (-6 = Unknown, -5 = Other, - = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'email_type_cl1'
order by value;


-- email_type frequency
    -- email_type (-6 = Unknown, -5 = Other, - = Missing in Error)
    -- email_type_oth (-7 = Not Applicable)
select e.email_type as email_type_value,
   d.label as email_type_description,
    email_type_oth, 
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_type = d.value
where type_name = 'email_type_cl1'
group by e.email_type;


-- EMAIL_SHARE ----------------------------------------------------------------------

select e.email_share as email_share_value,
   d.label as email_share_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_share = d.value
where type_name = 'confirm_type_cl1'
group by e.email_share;


-- EMAIL_ACTIVE ---------------------------------------------------------------------


-- email_active code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;

-- email_active frequency
select e.email_active as email_active_value,
   d.label as email_active_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_share = d.value
where type_name = 'confirm_type_cl2'
group by e.email_active;


-- TODO: does email_active correlate with email_rank, particulary for someone who has several different email addresses.


-- EMAIL_COMMENT --------------------------------------------------------------------
select email_comment, count(*) n
from email
group by email_comment;
-- DATA ISSUE (reported): what does a comment of -7 mean, and how does that differ from NA?


-- EMAIL_START_DATE & EMAIL_END_DATE ------------------------------------------------


-- email_start_date (6 = Unknown)
select email_start_date, count(*) n
from email
group by email_start_date
order by count(*) desc;


-- email_end_date (6 = Unknown)
select email_end_date, count(*) n
from email
group by email_end_date
order by count(*) desc;


-- TRANSACTION ----------------------------------------------------------------------

select transaction_type, count(*) n
from email
group by transaction_type;


/*************************************************************************************
 * table: telephone
 *************************************************************************************/

show columns from telephone;
select count(*) n from telephone;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) n
from telephone
group by psu_id
order by count(*) desc;

select t.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.psu_id = d.value
where type_name = 'psu_cl1'
group by t.psu_id;


-- PERSON_ID ------------------------------------------------------------------------

select person_id, count(*) n from telephone group by person_id order by count(*) desc;


-- PHONE_ID -----------------------------------------------------------------------

select phone_id, count(*) n from telephone group by phone_id order by count(*) desc;


-- INSTITUTE_ID ---------------------------------------------------------------------

-- ISSUE: no institute code list provded
select institute_id, count(*) n from telephone group by institute_id order by count(*) desc;


-- PROVIDER_ID ---------------------------------------------------------------------

-- ISSUE: no provider code list provded
select provider_id, count(*) n from telephone group by provider_id order by count(*) desc;


-- PHONE_INFO_SOURCE & PHONE_INFO_SOURCE_OTH ---------------------------------------

-- phone_info_source

select t.phone_info_source as phone_info_source_value,
   d.label as phone_info_source_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_info_source = d.value
where type_name = 'information_source_cl1'
group by t.phone_info_source;


-- phone_info_source_oth

select phone_info_source_oth as phone_info_source_oth_value,
   case
       when phone_info_source_oth = -7 then 'Not Applicable'
       else phone_info_source_oth
   end as phone_info_source_oth_description,
   count(*) n
from telephone
group by phone_info_source_oth;


-- PHONE_INFO_DATE & PHONE_INFO_UPDATE ----------------------------------------------

-- phone_info_date

select phone_info_date, count(*) n
from telephone
group by phone_info_date
order by count(*) desc;

-- phone_info_update

select phone_info_update, count(*) n
from telephone
group by phone_info_update
order by count(*) desc;


-- PHONE_NBR & PHONE_EXT ------------------------------------------------------------

-- phone_nbr

select phone_nbr, count(*) n
from telephone
group by phone_nbr
order by count(*) desc;

select phone_nbr, count(*) n
from telephone
where phone_nbr < 0
group by phone_nbr
order by count(*) desc;


-- phone_ext

select phone_ext, count(*) n
from telephone
group by phone_ext
order by count(*) desc;

select phone_ext, count(*) n
from telephone
where phone_ext < 0
group by phone_ext
order by count(*) desc;


-- EMAIL_TYPE & EMAIL_TYPE_OTH --------------------------------------------------

-- phone_type

select t.phone_type as phone_type_value,
   d.label as phone_type_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_type = d.value
where type_name = 'phone_type_cl1'
group by t.phone_type;

-- phone_type_oth

select phone_type_oth as phone_type_oth_value,
   case
       when phone_type_oth = -7 then 'Not Applicable'
       else phone_type_oth
   end as phone_type_oth_description,
   count(*) n
from telephone
group by phone_type_oth;


-- PHONE_RANK & PHONE_RANK_OTH --------------------------------------------------

-- phone_rank

select t.phone_rank as phone_rank_value,
   d.label as phone_rank_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_rank = d.value
where type_name = 'communication_rank_cl1'
group by t.phone_rank;

-- phone_rank_oth

select phone_rank_oth as phone_rank_oth_value,
   case
       when phone_rank_oth = -7 then 'Not Applicable'
       else phone_rank_oth
   end as phone_rank_oth_description,
   count(*) n
from telephone
group by phone_rank_oth;


-- PHONE_LANDLINE ---------------------------------------------------------------

select t.phone_landline as phone_landline_value,
   d.label as phone_landline_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_landline = d.value
where type_name = 'confirm_type_cl1'
group by t.phone_landline;


-- PHONE_SHARE ------------------------------------------------------------------

select t.phone_share as phone_share_value,
   d.label as phone_share_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_share = d.value
where type_name = 'confirm_type_cl2'
group by t.phone_share;


-- CELL_PERMISSION & TEXT_PERMISSION --------------------------------------------

-- cell_permission

select t.cell_permission as cell_permission_value,
   d.label as cell_permission_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.cell_permission = d.value
where type_name = 'confirm_type_cl2'
group by t.cell_permission;


-- text_permission

select t.text_permission as text_permission_value,
   d.label as text_permission_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.text_permission = d.value
where type_name = 'confirm_type_cl2'
group by t.text_permission;

-- PHONE_COMMENT ----------------------------------------------------------------

select phone_comment,
   count(*) as n
from telephone 
group by phone_comment;


-- PHONE_START_DATE & PHONE_START_DATE ------------------------------------------


-- phone_start_date

select phone_start_date,
   count(*) as n
from telephone 
group by phone_start_date;


-- phone_end_date

select phone_end_date,
   count(*) as n
from telephone 
group by phone_end_date;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from telephone 
group by transaction_type;

/*************************************************************************************
 * table: ppg_details
 *************************************************************************************/

show columns from ppg_details;
select count(*) n from ppg_details;
select * from ppg_details;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) from ppg_details group by psu_id;

select p.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from ppg_details p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where type_name = 'psu_cl1'
group by p.psu_id;


-- psu_id is not correct
select * from ppg_details where psu_id != 20000048;


-- PPG_DETAILS_ID -------------------------------------------------------------------


-- ppg_details_id frequency
select ppg_details_id, count(*) n 
from ppg_details 
group by ppg_details_id 
order by count(*) desc;


-- ppg_details_id is not unique
select * 
from 
	(
		select ppg_details_id, count(*) n 
		from ppg_details 
		group by ppg_details_id 
		order by count(*) desc
	) ppg
where ppg.n > 1;


-- P_ID -----------------------------------------------------------------------------

-- p_id freuqency
select p_id, count(*) n 
from ppg_details 
group by p_id 
order by count(*) desc;


-- ppg_details_id is not unique
select * 
from 
	(
		select p_id, count(*) n 
		from ppg_details 
		group by p_id 
		order by count(*) desc
	) ppg
where ppg.n > 1;


-- PPG_PID_STATUS -------------------------------------------------------------------


-- ppg_pid_status code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition
where type_name = 'participant_status_cl1'
order by value;


-- ppg_pid_status frequency
select p.ppg_pid_status as ppg_pid_status_value,
   d.label as ppg_pid_status_description,
   count(p.id) as n
from ppg_details p left outer join
   xsd_enumeration_definition d on p.ppg_pid_status = d.value
where type_name = 'participant_status_cl1'
group by p.ppg_pid_status;


-- PPG_FIRST ------------------------------------------------------------------------


-- ppg_first code list (-4= Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'ppg_status_cl1'
order by value;


-- ppg_first frequency
select p.ppg_first as ppg_first_value,
   d.label as ppg_first_description,
   count(p.id) as n
from ppg_details p left outer join
   xsd_enumeration_definition d on p.ppg_first = d.value
where type_name = 'ppg_status_cl1'
group by p.ppg_first;


-- TODO: ppg_pid_status by ppg_first frequency


-- ORIG_DUE_DATE --------------------------------------------------------------------


-- orig_due_date (1 = Refused, 6 = Unknown) frequency
select orig_due_date, count(*) n
from ppg_details 
group by orig_due_date
order by orig_due_date;


-- orig_due_date that are UNKNOWN
select orig_due_date, count(*) n
from ppg_details 
where orig_due_date like '%96%'
group by orig_due_date
order by orig_due_date;


-- odd orig_due_date
select orig_due_date, count(*) n
from ppg_details 
where (orig_due_date REGEXP '^9' or orig_due_date REGEXP '-9+') 
	and (orig_due_date not like '%96%' and orig_due_date not like '%91%')
group by orig_due_date
order by orig_due_date;
-- DATA ISSUE (reported): what does orig_due_date containing 92 and 97 mean?


-- DUE_DATE_2 -----------------------------------------------------------------------


-- due_date_2 (6 = Unknown)
select due_date_2, count(*) n
from ppg_details 
group by due_date_2
order by due_date_2;


-- due_date_2 that are UNKNOWN
select due_date_2, count(*) n
from ppg_details 
where due_date_2 like '%96%'
group by due_date_2
order by due_date_2;


-- odd due_date_2
select due_date_2, count(*) n
from ppg_details 
where (due_date_2 REGEXP '^9' or due_date_2 REGEXP '-9+') and (due_date_2 not like '%96%')
group by due_date_2
order by due_date_2;
-- DATA ISSUE (reported): what does a due_date_2 of 97 mean?


-- DUE_DATE_3 -----------------------------------------------------------------------


-- due_date_3 (6 = Unknown)
select due_date_3, count(*) n
from ppg_details 
group by due_date_3
order by due_date_3;


-- due_date_3 that are UNKNOWN
select due_date_3, count(*) n
from ppg_details 
where due_date_3 like '%96%'
group by due_date_3
order by due_date_3;


-- odd due_date_3
select due_date_3, count(*) n
from ppg_details 
where (due_date_3 REGEXP '^9' or due_date_2 REGEXP '-9+') and (due_date_2 not like '%96%')
group by due_date_3
order by due_date_3;
-- DATA ISSUE (reported): what does a due_date_3 of 97 mean?


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from ppg_details 
group by transaction_type;


/*************************************************************************************
 * table: ppg_status_history
 *************************************************************************************/

show columns from ppg_status_history;
select count(*) n from ppg_status_history;
select * from ppg_status_history;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) from ppg_status_history group by psu_id;

select p.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from ppg_status_history p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where type_name = 'psu_cl1'
group by p.psu_id;

-- psu_id  is not correct
select * from ppg_status_history where psu_id != 20000048;


-- PPG_HISTORY_ID -------------------------------------------------------------------


-- ppg_history_id frequency
select ppg_history_id, count(*) n 
from ppg_status_history
group by ppg_history_id 
order by count(*) desc;
-- DATA ISSUE (reported): the value of ppg_history_id comprise of p_id + ? + ppg_status_date.  What is the middle data?


-- ppg_history_id is not unique
select *
from
	(
		select ppg_history_id, count(*) n 
		from ppg_status_history
		group by ppg_history_id 
		order by count(*) desc
	) h
where h.n > 1;


-- P_ID -----------------------------------------------------------------------------

select p_id, count(*) n 
from ppg_status_history
group by p_id 
order by count(*) desc;


-- PGG_STATUS & PGG_STATUS_DATE -----------------------------------------------------


-- ppg_status code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'ppg_status_cl1'
order by value;


-- ppg_status frequency
select p.ppg_status as ppg_status_value,
   d.label as ppg_status_description,
   count(p.id) as n
from ppg_status_history p left outer join
   xsd_enumeration_definition d on p.ppg_status = d.value
where type_name = 'ppg_status_cl1'
group by p.ppg_status
order by p.ppg_status;


-- ppg_status_date frequency
select ppg_status_date, count(*) n
from ppg_status_history
group by ppg_status_date;


-- odd ppg_status_date
select ppg_status_date, count(*) n
from ppg_status_history
where (ppg_status_date REGEXP '^9' or ppg_status_date REGEXP '-9+') 
group by ppg_status_date
order by ppg_status_date;


-- PPG_INFO_SOURCE & PPG_INFO_SOURCE_OTH --------------------------------------------


-- ppg_info_source code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl3'
order by value;


-- ppg_info_source combine list frequency 
	-- ppg_info_source (-5 = Other, -4 = Missing in Error)
	-- ppg_info_source_oth (-7 = 'Not Applicable')
select p.ppg_info_source as ppg_info_source_value,
   d.label as ppg_info_source_description,
   ppg_info_source_oth,
   count(p.id) as n
from ppg_status_history p left outer join
   xsd_enumeration_definition d on p.ppg_info_source = d.value
where type_name = 'information_source_cl3'
group by p.ppg_info_source;


-- PPG_INFO_MODE & PPG_INFO_MODE_OTH ------------------------------------------------

-- ppg_info_mode code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'contact_type_cl1'
order by value;


-- ppg_info_mode combine list frequency 
	-- ppg_info_mode (-5 = Other, -4 = Missing in Error)
	-- ppg_info_mode_oth (-7 = 'Not Applicable')
select p.ppg_info_mode as ppg_info_mode_value,
   d.label as ppg_info_mode_description,
   ppg_info_mode_oth,
   count(p.id) as n
from ppg_status_history p left outer join
   xsd_enumeration_definition d on p.ppg_info_mode = d.value
where type_name = 'contact_type_cl1'
group by p.ppg_info_mode;


-- PPG_COMMENT ----------------------------------------------------------------------

select ppg_comment, count(*) n
from ppg_status_history
group by ppg_comment;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from ppg_status_history
group by transaction_type;


/*************************************************************************************
 *
 * 		CORRESPONDENCE & EVENTS
 *
 * 		Contact and Event: 
 * 				link_contact
 * 				contact 
 * 				event
 * 				instrument
 * 				
 * 		Non-interview Report: 
 * 				non_interview_rpt, 
 * 				non_interview_rpt_dutype, 
 * 				non_interview_rpt_noaccess, 
 * 				non_interview_rpt_refusal, 
 * 				non_interview_rpt_vacant
 * 				
 * 		Incident: 
 * 				incident
 * 				incident_media
 * 				incident_unanticipated
 * 				
 * 		Consent/Authorization: 
 * 				participant_auth
 * 				participant_consent 
 * 				participant_consent_sample
 * 				participant_rvis 
 * 				participant_vis_consent
 *
 *************************************************************************************/



/*************************************************************************************
 * table: link_contact
 *************************************************************************************/
 
show columns from link_contact;
select count(*) n from link_contact;
select * from link_contact limit 0,100;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) from link_contact group by psu_id;

select x.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from link_contact x left outer join
   xsd_enumeration_definition d on x.psu_id = d.value
where type_name = 'psu_cl1'
group by x.psu_id;

-- psu_id  is not correct
select * from ppg_status_history where psu_id != 20000048;


-- CONTACT_ID -----------------------------------------------------------------------


-- contact_id frequency
select contact_id, count(*) n
from link_contact 
group by contact_id 
order by count(*) desc;
-- DATA ISSUE (reported): what is the contact_id convention because some are 7-digits long 
-- while others are digits followed by a date and time?

-- select *
-- from link_contact 
-- where contact_id = 114000013;


-- CONTACT_LINK_ID ------------------------------------------------------------------


-- contact_link_id frequency
select contact_link_id, count(*) n
from link_contact 
group by contact_link_id 
order by contact_link_id desc;
-- DATA ISSUE: what does a contact_link_id link to?

-- contact_id with no contact_link_id
-- Note: for every contact_id there should be at least one link record (contact_link_id)
select *
from link_contact
where contact_link_id is null or contact_link_id = '';


-- EVENT_ID -------------------------------------------------------------------------


-- event_id frequency
select event_id, count(*) n
from link_contact 
group by event_id
order by count(*) desc;


-- INSTRUMENT_ID --------------------------------------------------------------------


-- instrument_id frequency
select instrument_id, count(*) n
from link_contact 
group by instrument_id 
order by count(*) desc;


-- contact_id with no instrument_id
select *
from link_contact 
where instrument_id is null or instrument_id = '';


-- STAFF_ID -------------------------------------------------------------------------


-- staff_id frequency
select staff_id, count(*) n
from link_contact 
group by staff_id 
order by count(*) desc;


-- contact_id with no staff_id
select *
from link_contact 
where staff_id is null or staff_id = '';


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) n
from link_contact 
group by person_id 
order by count(*) desc;
-- DATA ISSUE (reported): 164,132 with person_id of -7


-- PRIVIDER_ID ----------------------------------------------------------------------
select provider_id, count(*) n
from link_contact 
group by provider_id 
order by count(*);
-- DATA ISSUE: provider_id is either: null OR -7.  Is that correct?


-- TRANSACTION_TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from link_contact
group by transaction_type;


/*************************************************************************************
 * table: contact
 *************************************************************************************/

show columns from contact;
select count(*) n from contact;
select * from contact limit 0, 100;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) from contact group by psu_id;

select x.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.psu_id = d.value
where type_name = 'psu_cl1'
group by x.psu_id;

-- psu_id  is not correct
select * from link_contact where psu_id != 20000048;


-- CONTACT_ID -----------------------------------------------------------------------


-- contact_id frequency
select contact_id, count(*) n
from contact 
group by contact_id 
order by contact_id;
-- DATA ISSUE (reported): contact_id of -3 and -7
-- gms: nice!! I missed this one. It would also be nice to know what these different schemes meant, 
    -- e.g., those that start with a '1' versus other number schemes. I do not that if there is a number that starts with '6' 
    -- and ends with '0,' then that is a household contact.


-- contact_id is not unique
select *
from 
	(
		select contact_id, count(*) n
		from contact 
		group by contact_id 
	) l
where l.n > 1;


-- CONTACT_DISP ---------------------------------------------------------------------

select contact_disp, count(*) n
from contact 
group by contact_disp 
order by contact_disp;
-- MDES ISSUE: where is "Value from Disposition Codes on Event Disp Codes worksheet of this document" (code list)


-- CONTACT_TYPE & CONTACT_TYPE_OTH --------------------------------------------------


-- contact_type

select x.contact_type as contact_type_value,
   d.label as contact_type_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.contact_type = d.value
where type_name = 'contact_type_cl1'
group by x.contact_type;
-- DATA ISSUE: "Missing in Error" (n=2)


-- contact_type_oth

select contact_type_oth, 
   case
       when contact_type_oth = -7 then 'Not Applicable'
       else contact_type_oth
   end as contact_type_oth_description,
count(*) n
from contact 
group by contact_type_oth 
order by contact_type_oth;
-- ISSUE: contact_type_oth = -4 (n=153)


-- CONTACT_DATE, CONTACT_START_TIME & CONTACT_END_TIME ------------------------------


-- contact_date

select contact_date, count(*) n
from contact 
group by contact_date 
order by contact_date;


-- contact_start_tme 

select contact_start_time, count(*) n
from contact 
group by contact_start_time 
order by contact_start_time;


-- contact_end_time

select contact_end_time, count(*) n
from contact 
group by contact_end_time 
order by contact_end_time;


-- CONTACT_LANG & CONTACT_LANG_OTH --------------------------------------------------


-- code list for "contact_type_cl1"

select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- contact_lang

select x.contact_lang as contact_lang_value,
   d.label as contact_lang_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.contact_lang = d.value
where type_name = 'language_cl2'
group by x.contact_lang;
-- ISSUE: "Missing in Error" (n=165,848)


-- contact_lang_oth

select contact_lang_oth, 
   case
       when contact_lang_oth = -7 then 'Not Applicable'
       else contact_lang_oth
   end as contact_lang_oth_description,
	count(*) n
from contact 
group by contact_lang_oth 
order by contact_lang_oth;

-- CONTACT_INTERPRET & CONTACT_INTERPRET_OTH ----------------------------------------


-- contact_interpret
select x.contact_interpret as contact_interpret_value,
   d.label as contact_interpret_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.contact_interpret = d.value
where type_name = 'translation_method_cl3'
group by x.contact_interpret;
-- TODO: does contact_lang correlate with contact_interpret/


-- contact_interpret_oth

select contact_interpret_oth, 
   case
       when contact_interpret_oth = -7 then 'Not Applicable'
       else contact_interpret_oth
   end as contact_interpret_oth_description,
	count(*) n
from contact 
group by contact_interpret_oth 
order by contact_interpret_oth;


-- CONTACT_LOCATION & CONTACT_LOCATION_OTH ------------------------------------------


-- code list "contact_location_cl1"
select *
from xsd_enumeration_definition 
where type_name = 'contact_location_cl1'
group by value;


-- contact_location

select x.contact_location as contact_location_value,
   d.label as contact_location_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.contact_location = d.value
where type_name = 'contact_location_cl1'
group by x.contact_location;


-- contact_location_oth

select contact_location_oth, 
   case
       when contact_location_oth = -7 then 'Not Applicable'
       else contact_location_oth
   end as contact_location_oth_description,
	count(*) n
from contact 
group by contact_location_oth 
order by contact_location_oth;


-- CONTACT_PRIVATE & CONTACT_PRIVATE_OTH --------------------------------------------

-- code list "confirm_type_cl2"

select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
group by value;


-- contact_private

select x.contact_private as contact_private_value,
   d.label as contact_private_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.contact_private = d.value
where type_name = 'confirm_type_cl2'
group by x.contact_private;


-- contact_private_oth

select contact_private_detail, 
   case
       when contact_private_detail = -7 then 'Not Applicable'
       else contact_private_detail
   end as contact_private_detail_description,
	count(*) n
from contact 
group by contact_private_detail 
order by contact_private_detail;


-- CONTACT_DISTANCE -----------------------------------------------------------------

select contact_distance, count(*) n
from contact 
group by contact_distance 
order by contact_distance;
-- ISSUE: what is value of -4.00 (n=171,014)


-- WHO_CONTACTED & WHO_CONTACT_OTH --------------------------------------------------


-- code list "confirm_type_cl2"

select *
from xsd_enumeration_definition 
where type_name = 'contacted_person_cl1'
group by value;


-- who_contacted

select x.who_contacted as who_contacted_value,
   d.label as who_contacted_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.who_contacted = d.value
where type_name = 'contacted_person_cl1'
group by x.who_contacted;


-- who_contact_oth

select who_contact_oth, 
   case
       when who_contact_oth = -7 then 'Not Applicable'
       else who_contact_oth
   end as who_contact_oth_description,
	count(*) n
from contact 
group by who_contact_oth 
order by who_contact_oth;


-- CONTACT_COMMENT ------------------------------------------------------------------

select contact_comment, count(*) n
from contact 
group by contact_comment 
order by contact_comment;


-- TRANSACTION_TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from contact
group by transaction_type;


/*************************************************************************************
 * table: event
 *************************************************************************************/


show columns from event;
select count(*) n from event;
select * from event;


-- PSU_ID ---------------------------------------------------------------------------


-- frequency
select psu_id, count(*) n from event group by psu_id;


-- code list
select x.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.psu_id = d.value
where type_name = 'psu_cl1'
group by x.psu_id;


-- EVENT_ID -------------------------------------------------------------


-- event_id frequency
select event_id, count(*) n 
from event 
group by event_id;


-- event_id is not unique
select * 
from
	(
		select event_id, count(*) n 
		from event 
		group by event_id
	) e
where e.n > 1 ;


-- PARTICIPANT_ID -------------------------------------------------------------


-- participant_id frequency
select participant_id, count(*) n 
from event 
group by participant_id
order by count(*) desc;
-- DATA ISSUE: is it possible to have an event_id with no participant_id (n=27,242)?


-- EVENT_TYPE & EVENT_TYPE_OTH ------------------------------------------------


-- event_type code list (-5 = Other, -4 = Missing in Error)
select value as event_type_value, 
	label as event_type_description
from xsd_enumeration_definition
where type_name = 'event_type_cl1'
order by value;


-- event_type combine list (event_type & event_type_oth) frequency
	-- event_type (-5 = Other, -4 = Missing in Error)
	-- event_type_oth (-7 = 'Not Applicable')
select x.event_type as event_type_value,
   d.label as event_type_description,
   event_type_oth, 
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_type = d.value
where d.type_name = 'event_type_cl1'
group by x.event_type
order by x.event_type;


-- EVENT_REPEAT_KEY -----------------------------------------------------------

-- event_repeat_key frequency
select event_repeat_key, count(*) n 
from event 
group by event_repeat_key;


-- TODO: what event_type have event_repeat_key?


-- EVENT_DISP & EVENT_DISP_CAT ------------------------------------------------


-- event_disp frequency
select event_disp, count(*) n 
from event 
group by event_disp
order by event_disp;


-- TODO: list event_type by event_disp


-- event_disp_cat code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'event_dspstn_cat_cl1'
order by value;


-- event_disp_cat frequency
select x.event_disp_cat as event_disp_cat_value,
   d.label as event_disp_cat_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_disp_cat = d.value
where d.type_name = 'event_dspstn_cat_cl1'
group by x.event_disp_cat
order by x.event_disp_cat;


-- TODO: list event_disp_cat, by event_type, by event_disp


-- EVENT_START_DATE & EVENT_START_TIME ----------------------------------------


-- event_start_date frequency
select event_start_date, count(*)
from event
group by event_start_date
order by event_start_date;


-- odd event_start_date
select event_start_date, count(*) n
from event
where (event_start_date REGEXP '^9' or event_start_date REGEXP '-9+')
group by event_start_date;
-- DATA ISSUE (reported): what does event_start_date of 96 and 92 mean?


-- event_start_time frequency
select event_start_time, count(*)
from event
group by event_start_time
order by event_start_time;


-- odd event_start_time
select event_start_time, count(*) n
from event
where (event_start_time REGEXP '^9' or event_start_time REGEXP ':9+')
group by event_start_time;
-- DATA ISSUE (reported): what does event_start_time of 96 mean?


-- event_start_date or event_start_time is null
select id, event_start_date, event_start_time
from event
where event_start_date is null 
	or event_start_date = ''
	or event_start_time is null
	or event_start_time = '';


-- EVENT_END_DATE & EVENT_END_TIME --------------------------------------------


-- event_end_date frequency
select event_end_date, count(*)
from event
group by event_end_date
order by event_end_date;


-- odd event_end_date
select event_end_date, count(*)
from event
where (event_end_date REGEXP '^9' or event_end_date REGEXP '-9+')
group by event_end_date
order by event_end_date;
-- DATA ISSUE (reported): what does event_end_date of 92 (n=2), 96 (n=44), and 97 (n=23,164) mean?


-- event_end_time frequency
select event_end_time, count(*)
from event
group by event_end_time
order by event_end_time;
-- DATA ISSUE (reported): there's an event_end_time of 00:22. Does that make sense?


-- odd event_end_time
select event_end_time, count(*) n
from event
where (event_end_time REGEXP '^9' or event_end_time REGEXP ':9+')
group by event_end_time;
-- DATA ISSUE (reported): what does event_end_time of 96:96 (n=172) and 97:97 (n=23,167) mean?


-- either event_end_date or event_end_time is null
select id, event_end_date, event_end_time
from event
where event_end_date is null 
	or event_end_date = ''
	or event_end_time is null
	or event_end_time = '';


-- EVENT_BREAKOFF -------------------------------------------------------------


-- event_breakoff code list (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl1'
order by value;


-- event_breakoff frequency
select x.event_breakoff as event_breakoff_value,
   d.label as event_breakoff_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_breakoff = d.value
where type_name = 'confirm_type_cl1'
group by x.event_breakoff;


-- TODO: which event_type had event_breakoff


-- EVENT_INCENTIVE_TYPE, EVENT_INCENT_CASH & EVENT_INCENT_NONCASH -------------


-- event_incentive_type code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'incentive_type_cl1'
order by value;


-- event_incentive_type frequency
select x.event_incentive_type as event_incentive_type_value,
   d.label as event_incentive_type_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_incentive_type = d.value
where type_name = 'incentive_type_cl1'
group by x.event_incentive_type
order by x.event_incentive_type;


-- event_incent_cash frequency
select event_incent_cash, count(*) n 
from event 
group by event_incent_cash;


-- event_incent_noncash frequency
select if(event_incent_noncash = -7, 'Not Applicable', event_incent_noncash) event_incent_noncash, count(*) n 
from event 
group by event_incent_noncash;


-- TODO: does event_incentive_type, event_incent_cash, and event_incent_noncash correlate?


-- EVENT_COMMENT --------------------------------------------------------------


-- event_comment frequency
select event_comment, count(*) n 
from event 
group by event_comment;


-- TRANSITION_TYPE ------------------------------------------------------------

select transaction_type, count(*) n
from event
group by transaction_type;



/*************************************************************************************
 * table: instrument
 *************************************************************************************/


show columns from instrument;
select count(*) n from instrument;


-- PSU_ID ---------------------------------------------------------------------------


-- frequency
select psu_id, count(*) n from instrument group by psu_id;


-- code list
select x.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.psu_id = d.value
where type_name = 'psu_cl1'
group by x.psu_id;


-- psu_id is not correct
select * from instrument where psu_id != 20000048;


-- INSTRUMENT_ID --------------------------------------------------------------------


-- instrument_id frequency
select instrument_id, count(*) n from instrument group by instrument_id;


-- multiple instrument_id 
select * 
from
	(
		select instrument_id, count(*) n 
		from instrument 
		group by instrument_id
	) i
where i.n > 1
order by i.n;


-- EVENT_ID -------------------------------------------------------------------------


-- instrument_id frequency
select event_id, count(*) n from instrument group by event_id;


-- multiple instrument_id 
select * 
from
	(
		select event_id, count(*) n 
		from instrument 
		group by event_id
	) i
where i.n > 1
order by i.n;


-- INSTRUMENT_TYPE & INSTRUMENT_TYPE_OTH --------------------------------------------


-- instrument_type frequency

select x.instrument_type as instrument_type_value,
   d.label as instrument_type_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.instrument_type = d.value
where type_name = 'instrument_type_cl1'
group by x.instrument_type;


-- instrument_type_oth frequency

select instrument_type_oth, 
   case
       when instrument_type_oth = -7 then 'Not Applicable'
       else instrument_type_oth
   end as instrument_type_oth_description,
	count(*) n
from instrument
group by instrument_type_oth
order by instrument_type_oth;


-- INSTRUMENT_VERSION ---------------------------------------------------------------

select instrument_version, count(*) n from instrument group by instrument_version;


-- INSTRUMENT_REPEAT_KEY ------------------------------------------------------------

select instrument_repeat_key, count(*) n from instrument group by instrument_repeat_key;


-- INS_DATE_START & INS_START_TIME --------------------------------------------------


-- missing ins_date_start or ins_start_time
select id, ins_date_start, ins_start_time
from instrument
where ins_date_start is null
	or ins_start_time is null;


-- INS_DATE_END & INS_END_TIME ------------------------------------------------------


-- missing ins_date_end or ins_end_time
select id, ins_date_end, ins_end_time
from instrument
where ins_date_end is null
	or ins_end_time is null;


-- INS_BREAKOFF ---------------------------------------------------------------------


-- ins_breakoff code list
select * from xsd_enumeration_definition where type_name = 'confirm_type_cl2';


-- ins_breakoff frequency
select x.ins_breakoff as ins_breakoff_value,
   d.label as ins_breakoff_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.ins_breakoff = d.value
where type_name = 'confirm_type_cl2'
group by x.ins_breakoff;


-- INS_STATUS -----------------------------------------------------------------------


-- ins_status code list
select * from xsd_enumeration_definition where type_name = 'instrument_status_cl1' order by value;


-- ins_status frequency
select x.ins_status as ins_status_value,
   d.label as ins_status_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.ins_status = d.value
where type_name = 'instrument_status_cl1'
group by x.ins_status;


-- INS_MODE & INS_MODE_OTH ----------------------------------------------------------


-- ins_mode code list
select *
from xsd_enumeration_definition 
where type_name = 'instrument_admin_mode_cl1'
order by value;


-- ins_mode frequency
select x.ins_mode as ins_mode_value,
   d.label as ins_mode_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.ins_mode = d.value
where type_name = 'instrument_admin_mode_cl1'
group by x.ins_mode;


-- ins_mode_oth frequency
select ins_mode_oth, 
   case
       when ins_mode_oth = -7 then 'Not Applicable'
       else ins_mode_oth
   end as ins_mode_oth_description,
	count(*) n
from instrument
group by ins_mode_oth
order by ins_mode_oth;


-- INS_METHOD -----------------------------------------------------------------------


-- ins_method code list
select *
from xsd_enumeration_definition 
where type_name = 'instrument_admin_method_cl1'
order by value;


-- ins_method frequency
select x.ins_method as ins_method_value,
   d.label as ins_method_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.ins_method = d.value
where type_name = 'instrument_admin_method_cl1'
group by x.ins_method;


-- SUP_REVIEW -----------------------------------------------------------------------


-- sup_review code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- sup_review frequency
select x.sup_review as sup_review_value,
   d.label as sup_review_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.sup_review = d.value
where type_name = 'confirm_type_cl2'
group by x.sup_review;


-- DATA_PROBLEM ---------------------------------------------------------------------


-- data_problem code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- sup_review frequency
select x.data_problem as data_problem_value,
   d.label as data_problem_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.data_problem = d.value
where type_name = 'confirm_type_cl2'
group by x.data_problem;


-- INSTRU_COMMENT -------------------------------------------------------------------

select instru_comment, count(*) n from instrument group by instru_comment;


-- TRANSACTION_TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from instrument
group by transaction_type;


/*************************************************************************************
 * table: non_interview_rpt
 *************************************************************************************/


show columns from non_interview_rpt;
select count(*) n from non_interview_rpt;
select * from non_interview_rpt;


-- PSU_ID ---------------------------------------------------------------------------


-- frequency
select psu_id, count(*) n from non_interview_rpt group by psu_id;


-- code list
select x.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(x.id) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.psu_id = d.value
where type_name = 'psu_cl1'
group by x.psu_id;


-- NIR_ID ---------------------------------------------------------------------------


-- nir_id is not unique
select *
from
    (
        select nir_id, count(*) n 
        from non_interview_rpt 
        group by nir_id
    ) nir
where nir.n > 1;


-- CONTACT_ID -----------------------------------------------------------------------


-- contact_id frequency
select contact_id, count(*) n 
from non_interview_rpt 
group by contact_id
order by count(*) desc;


-- contact_id is not unique
select *
from
	(
		select contact_id, count(*) n 
		from non_interview_rpt 
		group by contact_id
	) r
where r.n > 1;


-- NIR ------------------------------------------------------------------------------


-- nir frequency
select nir, count(*) n 
from non_interview_rpt 
group by nir 
order by count(*) desc;


-- DU_ID ----------------------------------------------------------------------------

-- du_id frequency
select du_id, count(*) n 
from non_interview_rpt 
group by du_id 
order by count(*) desc;
-- ISSUE: why are there 173 null du_id?


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) n 
from non_interview_rpt 
group by person_id 
order by count(*) desc;
-- ISSUE: why are there 150,778 missing person_ids
-- gms: these are contacts with households... the person_id should be irrelevant


-- NIR_VAC_INFO & NIR_VAC_INFO_OTH --------------------------------------------------


-- nir_vac_info code list (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'du_vacancy_info_source_cl1'
order by value;


-- nir_vac_info combine list frequency
    -- nir_vac_info (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
    -- nir_vac_info_oth (-7 = Not Applicable)
select x.nir_vac_info as nir_vac_info_value,
   d.label as nir_vac_info_description,
    nir_vac_info_oth,
   count(x.id) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_vac_info = d.value
where type_name = 'du_vacancy_info_source_cl1'
group by x.nir_vac_info;


-- NIR_NOACCESS & NIR_NOACCESS_OTH --------------------------------------------------


-- nir_noaccess code list (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'no_access_descr_cl1'
order by value;


-- nir_noaccess combine list frequency
select x.nir_noaccess as nir_noaccess_value,
    d.label as nir_noaccess_description,
    nir_noaccess_oth,
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_noaccess = d.value
where type_name = 'no_access_descr_cl1'
group by x.nir_noaccess;


-- NIR_ACCESS_ATTEMPT & NIR_ACCESS_ATTEMPT_OTH --------------------------------------


-- nir_access_attempt code list
select *
from xsd_enumeration_definition 
where type_name = 'access_attempt_cl1'
order by value;


-- nir_access_attempt frequency
select x.nir_access_attempt as nir_access_attempt_value,
   d.label as nir_access_attempt_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_access_attempt = d.value
where type_name = 'access_attempt_cl1'
group by x.nir_access_attempt;


-- nir_access_attempt_oth frequency

select nir_access_attempt_oth, count(*) n
from non_interview_rpt 
group by nir_access_attempt_oth;


-- NIR_TYPE_PERSON & NIR_TYPE_PERSON_OTH --------------------------------------------


-- nir_type_person code list
select *
from xsd_enumeration_definition 
where type_name = 'nir_reason_person_cl1'
order by value;


-- nir_type_person frequency
select x.nir_type_person as nir_type_person_value,
   d.label as nir_type_person_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_type_person = d.value
where type_name = 'nir_reason_person_cl1'
group by x.nir_type_person;


-- nir_type_person_oth frequency
select nir_type_person_oth, count(*) n
from non_interview_rpt 
group by nir_type_person_oth;


-- COG_INFORM_RELATION & COG_INFORM_RELATION_OTH ------------------------------------


-- cog_inform_relation code list
select *
from xsd_enumeration_definition 
where type_name = 'nir_inform_relation_cl1'
order by value;


-- cog_inform_relation frequency
select x.cog_inform_relation as cog_inform_relation_value,
   d.label as cog_inform_relation_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.cog_inform_relation = d.value
where type_name = 'nir_inform_relation_cl1'
group by x.cog_inform_relation;


-- cog_inform_relation_oth frequency
select cog_inform_relation_oth, count(*) n
from non_interview_rpt 
group by cog_inform_relation_oth;


-- COG_DIS_DESC ---------------------------------------------------------------------

select cog_dis_desc, count(*) n
from non_interview_rpt 
group by cog_dis_desc;


-- PERM_DISABILITY ------------------------------------------------------------------


-- perm_disability code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl10'
order by value;


-- perm_disability frequency
select x.perm_disability as perm_disability_value,
   d.label as perm_disability_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.perm_disability = d.value
where type_name = 'confirm_type_cl10'
group by x.perm_disability;


-- DECEASED_INFORM_RELATION & DECEASED_INFORM_OTH -----------------------------------


-- deceased_inform_relation code list
select *
from xsd_enumeration_definition 
where type_name = 'nir_inform_relation_cl1'
order by value;


-- deceased_inform_relation frequency
select x.deceased_inform_relation as deceased_inform_relation_value,
   d.label as deceased_inform_relation_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.deceased_inform_relation = d.value
where type_name = 'nir_inform_relation_cl1'
group by x.deceased_inform_relation;


-- deceased_inform_oth frequency
select deceased_inform_oth, count(*) n
from non_interview_rpt 
group by deceased_inform_oth;


-- YOD ------------------------------------------------------------------------------

-- yod frequency
select yod, count(*) n
from non_interview_rpt 
group by yod;


-- STATE_DEATH ----------------------------------------------------------------------


-- state_death frequency
select state_death, count(*) n
from non_interview_rpt 
group by state_death;


-- WHO_REFUSED & WHO_REFUSED_OTH ----------------------------------------------------


-- who_refused code list
select *
from xsd_enumeration_definition 
where type_name = 'nir_inform_relation_cl1'
order by value;


-- who_refused frequency
select x.who_refused as who_refused_value,
   d.label as who_refused_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.who_refused = d.value
where type_name = 'nir_inform_relation_cl1'
group by x.who_refused;


-- who_refused_oth frequency
select who_refused_oth, count(*) n
from non_interview_rpt 
group by who_refused_oth;


-- REFUSER_STRENGTH -----------------------------------------------------------------


-- refuser_strength code list
select *
from xsd_enumeration_definition 
where type_name = 'refusal_intensity_cl1'
order by value;


-- refuser_strength frequency
select x.refuser_strength as refuser_strength_value,
   d.label as refuser_strength_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.refuser_strength = d.value
where type_name = 'refusal_intensity_cl1'
group by x.refuser_strength;


-- REF_ACTION -----------------------------------------------------------------------


-- ref_action code list
select *
from xsd_enumeration_definition 
where type_name = 'refusal_action_cl1'
order by value;


-- refuser_strength frequency
select x.ref_action as ref_action_value,
   d.label as ref_action_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.ref_action = d.value
where type_name = 'refusal_action_cl1'
group by x.ref_action;


-- LT_ILLNESS_DESC ------------------------------------------------------------------


-- lt_illness_desc frequency
select lt_illness_desc, count(*) n
from non_interview_rpt 
group by lt_illness_desc;


-- PERM_LTR -------------------------------------------------------------------------

-- perm_ltr code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl10'
order by value;


-- perm_ltr frequency
select x.perm_ltr as perm_ltr_value,
   d.label as perm_ltr_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.perm_ltr = d.value
where type_name = 'confirm_type_cl10'
group by x.perm_ltr;


-- REASON_UNAVAIL & REASON_UNAVAIL_OTH ----------------------------------------------


-- reason_unavail code list
select *
from xsd_enumeration_definition 
where type_name = 'unavailable_reason_cl1'
order by value;


-- reason_unavail frequency
select x.reason_unavail as reason_unavail_value,
   d.label as reason_unavail_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.reason_unavail = d.value
where type_name = 'unavailable_reason_cl1'
group by x.reason_unavail;


-- reason_unavail_oth frequency
select reason_unavail_oth, count(*) n
from non_interview_rpt 
group by reason_unavail_oth;


-- DATE_AVAILABLE -------------------------------------------------------------------

select date_available, count(*) n
from non_interview_rpt 
group by date_available;


-- DATE_MOVED -----------------------------------------------------------------------

select date_moved, count(*) n
from non_interview_rpt 
group by date_moved;


-- MOVED_LENGTH_TIME ----------------------------------------------------------------

select moved_length_time, count(*) n
from non_interview_rpt 
group by moved_length_time;


-- MOVED_UNIT -----------------------------------------------------------------------

select moved_unit, count(*) n
from non_interview_rpt 
group by moved_unit;

-- moved_unit frequency
select x.moved_unit as moved_unit_value,
   d.label as moved_unit_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.moved_unit = d.value
where type_name = 'time_unit_past_cl1'
group by x.moved_unit;


-- MOVED_INFORM_RELATION & MOVED_RELATION_OTH ---------------------------------------


-- moved_inform_relation code list
select *
from xsd_enumeration_definition 
where type_name = 'moved_inform_relation_cl1'
order by value;


-- moved_inform_relation frequency
select x.moved_inform_relation as moved_inform_relation_value,
   d.label as moved_inform_relation_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.moved_inform_relation = d.value
where type_name = 'moved_inform_relation_cl1'
group by x.moved_inform_relation;


-- moved_relation_oth frequency
select moved_relation_oth, count(*) n
from non_interview_rpt 
group by moved_relation_oth;


-- NIR_OTH --------------------------------------------------------------------------


-- nir_other frequency
select nir_other, count(*) n
from non_interview_rpt 
group by nir_other;


-- TRANSACTION_TYPE -----------------------------------------------------------------


-- transaction_type frequency

select transaction_type, count(*) n
from non_interview_rpt
group by transaction_type;



/*************************************************************************************
 * table: non_interview_rpt_dutype
 *************************************************************************************/


show columns from non_interview_rpt_dutype;
select count(*) n from non_interview_rpt_dutype;

-- NOTE: no data

 

/*************************************************************************************
 * table: non_interview_rpt_noaccess
 *************************************************************************************/


show columns from non_interview_rpt_noaccess;
select count(*) n from non_interview_rpt_noaccess;

-- NOTE: no data


 
/*************************************************************************************
 * table: non_interview_rpt_refusal
 *************************************************************************************/


show columns from non_interview_rpt_refusal;
select count(*) n from non_interview_rpt_refusal;

-- NOTE: no data


 
/*************************************************************************************
 * table: non_interview_rpt_vacant
 *************************************************************************************/

show columns from non_interview_rpt_vacant;
select count(*) n from non_interview_rpt_vacant;

-- NOTE: no data



/*************************************************************************************
 * table: incident
 *************************************************************************************/

show columns from incident;
select count(*) n from incident;
select * from incident;

-- NOTE: no data


/*************************************************************************************
 * table: incident_media
 *************************************************************************************/


show columns from incident_media;
select count(*) n from incident_media;
select * from incident_media;

-- NOTE: no data


/*************************************************************************************
 * table: incident_unanticipated
 *************************************************************************************/

show columns from incident_unanticipated;
select count(*) n from incident_unanticipated;
select * from incident_unanticipated;

-- NOTE: no data



/*************************************************************************************
 * table: participant_auth
 *************************************************************************************/

show columns from participant_auth;
select count(*) n from participant_auth;

-- NOTE: no data



/*************************************************************************************
 * table: participant_consent 
 *************************************************************************************/


show columns from participant_consent;
select count(*) n from participant_consent;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- PARTICIPANT_CONSENT_ID -----------------------------------------------------------


-- participant_consent_id frequency
select participant_consent_id, count(*) n
from participant_consent
group by participant_consent_id;


-- multiple participant_consent_id 
select *
from
	(
		select participant_consent_id, count(*) n
		from participant_consent
		group by participant_consent_id
	) c
where c.n > 1;


-- P_ID -----------------------------------------------------------------------------


-- p_id frequency
select p_id, count(*) n
from participant_consent
group by p_id
order by count(*);


-- multiple p_id 
select *
from
	(
		select p_id, count(*) n
		from participant_consent
		group by p_id
	) c
where c.n > 1;


-- CONSENT_VERSION ------------------------------------------------------------------

select consent_version, count(*) n
from participant_consent
group by consent_version
order by count(*);


-- CONSENT_EXPIRATION ---------------------------------------------------------------

select consent_expiration, count(*) n
from participant_consent
group by consent_expiration
order by count(*);


-- CONSENT_TYPE (for Phase 1 Concent only) ------------------------------------------

-- consent_type code list
select *
from xsd_enumeration_definition 
where type_name = 'consent_type_cl1'
order by value;


-- consent_type frequency
select x.consent_type as consent_type_value,
   d.label as consent_type_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_type = d.value
where type_name = 'consent_type_cl1'
group by x.consent_type;


-- CONSENT_FORM_TYPE (for Phase 1 Concent only) -------------------------------------


-- consent_form_type code list
select *
from xsd_enumeration_definition 
where type_name = 'consent_type_cl1'
order by value;


-- consent_type frequency
select x.consent_form_type as consent_form_type_value,
   d.label as consent_form_type_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_form_type = d.value
where type_name = 'consent_type_cl1'
group by x.consent_form_type;


-- CONSENT_GIVEN --------------------------------------------------------------------


-- consent_given code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- consent_given frequency
select x.consent_given as consent_given_value,
   d.label as consent_given_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_given = d.value
where type_name = 'confirm_type_cl2'
group by x.consent_given;


-- CONSENT_DATE ---------------------------------------------------------------------

-- consent_date frequency
select consent_date, count(*) n
from participant_consent
group by consent_date
order by count(*);

-- no consent_date
select *
from participant_consent
where consent_date is null;


-- CONSENT_WITHDRAW -----------------------------------------------------------------


-- consent_withdraw code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- consent_given frequency
select x.consent_withdraw as consent_withdraw_value,
   d.label as consent_withdraw_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_withdraw = d.value
where type_name = 'confirm_type_cl2'
group by x.consent_withdraw;


-- CONSENT_WITHDRAW_TYPE ------------------------------------------------------------


-- consent_withdraw_type code list
select *
from xsd_enumeration_definition 
where type_name = 'consent_withdraw_reason_cl1'
order by value;


-- consent_withdraw_type frequency
select x.consent_withdraw_type as consent_withdraw_type_value,
   d.label as consent_withdraw_type_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_withdraw_type = d.value
where type_name = 'consent_withdraw_reason_cl1'
group by x.consent_withdraw_type;


-- CONSENT_WITHDRAW_REASON ----------------------------------------------------------


-- consent_withdraw_reason code list
select *
from xsd_enumeration_definition 
where type_name = 'consent_withdraw_reason_cl2'
order by value;


-- consent_withdraw_reason frequency
select x.consent_withdraw_reason as consent_withdraw_reason_value,
   d.label as consent_withdraw_reason_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_withdraw_reason = d.value
where type_name = 'consent_withdraw_reason_cl2'
group by x.consent_withdraw_reason;
-- ISSUE: why all are "Missing in Error" (-4), when the consent_withdraw_type for all are "Legitimate Skip" (-3)


-- CONSENT_WITHDRAW_DATE ------------------------------------------------------------

select consent_withdraw_date, count(*) n
from participant_consent
group by consent_withdraw_date
order by count(*);


-- CONSENT_LANGUAGE & CONSENT_LANGUAGE_OTH ------------------------------------------


-- consent_language code list
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- consent_language frequency
select x.consent_language as consent_language_value,
   d.label as consent_language_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_language = d.value
where type_name = 'language_cl2'
group by x.consent_language;


-- consent_language_oth frequency
select consent_language_oth, 
   case
       when consent_language_oth = -7 then 'Not Applicable'
       else consent_language_oth
   end as consent_language_oth_description,
	count(*) n
from participant_consent
group by consent_language_oth;
-- DATA ISSUE (reported): what does consent_language of -3 mean?


-- PERSON_WHO_CONSENTED_ID & WHO_CONSENTED ------------------------------------------

-- person_who_consented_id frequency
select person_who_consented_id, count(*) n
from participant_consent
group by person_who_consented_id
order by count(*) desc;

-- person_who_consented_id is null
select *
from participant_consent
where person_who_consented_id is null;


-- who_consented code list
select *
from xsd_enumeration_definition 
where type_name = 'age_status_cl1'
order by value;


-- who_consented frequency
select x.who_consented as who_consented_value,
   d.label as who_consented_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.who_consented = d.value
where type_name = 'age_status_cl1'
group by x.who_consented;


-- who_consented is null
select *
from participant_consent
where who_consented is null;


-- PERSON_WTHDRW_CONSENT_ID & WHO_WTHDRW_CONSENT ----------------------------------


-- person_wthdrw_consent_id frequency
select person_wthdrw_consent_id, count(*) n
from participant_consent
group by person_wthdrw_consent_id
order by count(*) desc;
-- DATA ISSUE (reported): what is person_wthdrw_consent_id of -7


-- person_wthdrw_consent_id is null
select *
from participant_consent
where person_wthdrw_consent_id is null;


-- who_wthdrw_consent code list
select *
from xsd_enumeration_definition 
where type_name = 'age_status_cl3'
order by value;


-- who_consented frequency
select x.who_wthdrw_consent as who_wthdrw_consent_value,
   d.label as who_wthdrw_consent_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.who_wthdrw_consent = d.value
where type_name = 'age_status_cl3'
group by x.who_wthdrw_consent;


-- CONSENT_TRANSLATE ----------------------------------------------------------------


-- consent_translate code list
select *
from xsd_enumeration_definition 
where type_name = 'translation_method_cl1'
order by value;


-- consent_translate frequency
select x.consent_translate as consent_translate_value,
   d.label as consent_translate_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_translate = d.value
where type_name = 'translation_method_cl1'
group by x.consent_translate;


-- CONSENT_COMMENTS -----------------------------------------------------------------

select consent_comments, count(*) n
from participant_consent
group by consent_comments
order by count(*) desc;
-- DATA ISSUE (reported): what is consent_comment = -3


-- CONTACT_ID -----------------------------------------------------------------------

select contact_id, count(*) n
from participant_consent
group by contact_id
order by count(*) desc;

-- contact_id is null
select *
from participant_consent
where contact_id is null;


-- RECONSIDERATION_SCRIPT_USE -------------------------------------------------------


-- reconsideration_script_use code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl21'
order by value;


-- reconsideration_script_use frequency
select x.reconsideration_script_use as reconsideration_script_use_value,
   d.label as reconsideration_script_use_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.reconsideration_script_use = d.value
where type_name = 'confirm_type_cl21'
group by x.reconsideration_script_use;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 


/*************************************************************************************
 * table: participant_consent_sample
 *************************************************************************************/

show columns from participant_consent_sample;
select count(*) n from participant_consent_sample;

-- NOTE: no data


/*************************************************************************************
 * table: participant_vis_consent 
 *************************************************************************************/

show columns from participant_vis_consent;
select count(*) n from participant_vis_consent;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- PID_VISIT_CONSENT_ID -------------------------------------------------------------

select pid_visit_consent_id, count(*) n from participant_vis_consent group by pid_visit_consent_id order by count(*);

select pid_visit_consent_id from participant_vis_consent where pid_visit_consent_id is null;


-- P_ID -----------------------------------------------------------------------------

select p_id, count(*) n from participant_vis_consent group by p_id order by count(*);

select p_id from participant_vis_consent where p_id is null;


-- VIS_CONSENT_TYPE -----------------------------------------------------------------


-- vis_consent_type code list
select *
from xsd_enumeration_definition 
where type_name = 'visit_type_cl1'
order by value;


-- vis_consent_type frequency
select x.vis_consent_type as vis_consent_type_value,
   d.label as vis_consent_type_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_consent_type = d.value
where type_name = 'visit_type_cl1'
group by x.vis_consent_type;


-- VIS_CONSENT_RESPONSE -------------------------------------------------------------


-- vis_consent_response code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- vis_consent_response frequency
select x.vis_consent_response as vis_consent_response_value,
   d.label as vis_consent_response_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_consent_response = d.value
where type_name = 'confirm_type_cl2'
group by x.vis_consent_response;


-- VIS_LANGUAGE & VIS_LANGUAGE_OTH --------------------------------------------------


-- vis_language code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- vis_language frequency
select x.vis_language as vis_language_value,
   d.label as vis_language_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_language = d.value
where type_name = 'language_cl2'
group by x.vis_language;


-- vis_language_oth frequency
select vis_language_oth, 
   case
       when vis_language_oth = -7 then 'Not Applicable'
       else vis_language_oth
   end as vis_language_oth_description,
	count(*) n 
from participant_vis_consent 
group by vis_language_oth 
order by count(*);


-- VIS_PERSON_WHO_CONSENTED_ID ------------------------------------------------------

select vis_person_who_consented_id, count(*) n from participant_vis_consent group by vis_person_who_consented_id order by count(*);

select vis_person_who_consented_id from participant_vis_consent where vis_person_who_consented_id is null;


-- VIS_WHO_CONSENTED ----------------------------------------------------------------


-- vis_who_consented code list
select *
from xsd_enumeration_definition 
where type_name = 'age_status_cl1'
order by value;


-- vis_who_consented frequency
select x.vis_who_consented as vis_who_consented_value,
   d.label as vis_who_consented_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_who_consented = d.value
where type_name = 'age_status_cl1'
group by x.vis_who_consented;


-- VIS_TRANSLATE --------------------------------------------------------------------


-- vis_translate code list
select *
from xsd_enumeration_definition 
where type_name = 'translation_method_cl1'
order by value;


-- vis_translate frequency
select x.vis_translate as vis_translate_value,
   d.label as vis_translate_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_translate = d.value
where type_name = 'translation_method_cl1'
group by x.vis_translate;


-- VIS_COMMENTS ---------------------------------------------------------------------

select vis_comments, count(*) n from participant_vis_consent group by vis_comments order by count(*);


-- CONTACT_ID -----------------------------------------------------------------------

select contact_id, count(*) n from participant_vis_consent group by contact_id order by count(*);

select contact_id from participant_vis_consent where contact_id is null;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


/*************************************************************************************
 * table: participant_rvis
 *************************************************************************************/

show columns from participant_rvis;
select count(*) n from participant_rvis;

-- NOTE: no data



/*************************************************************************************
 *
 * 		OUTREACH
 * 				outreach
 * 				outreach_eval
 * 				outreach_lang2
 * 				outreach_race 
 * 				outreach_staff
 * 				outreach_target
 *
 *************************************************************************************/


/*************************************************************************************
 * table: outreach
 *************************************************************************************/

show columns from outreach;
select count(*) n from outreach;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- TSU_ID ---------------------------------------------------------------------------

select tsu_id, count(*) n from outreach group by tsu_id order by count(*);

select tsu_id from outreach where tsu_id is null;


-- SSU_ID ---------------------------------------------------------------------------

select ssu_id, count(*) n from outreach group by ssu_id order by count(*);
-- DATA ISSUE (reported): why is there ssu_id = -7 (n=3)

select ssu_id from outreach where ssu_id is null;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------

select outreach_event_id, count(*) n from outreach group by outreach_event_id order by count(*);

select outreach_event_id from outreach where outreach_event_id is null;

select * 
from
	(
		select outreach_event_id, count(*) n 
		from outreach
		group by outreach_event_id
	) o
where o.n > 1;


-- OUTREACH_EVENT_DATE --------------------------------------------------------------

select outreach_event_date, count(*) n from outreach group by outreach_event_date order by count(*);

select outreach_event_date from outreach where outreach_event_date is null;


-- OUTREACH_TARGET & OUTREACH_TARGET_OTH --------------------------------------------


-- outreach_target code list
select *
from xsd_enumeration_definition 
where type_name = 'outreach_target_cl1'
order by value;


-- outreach_target frequency
select x.outreach_target as outreach_target_value,
   d.label as outreach_target_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.outreach_target = d.value
where type_name = 'outreach_target_cl1'
group by x.outreach_target;


-- outreach_target_oth frequency
select outreach_target_oth, count(*) n from outreach group by outreach_target_oth order by count(*);


-- OUTREACH_MODE & OUTREACH_MODE_OTH ------------------------------------------------


-- outreach_mode code list
select *
from xsd_enumeration_definition 
where type_name = 'outreach_mode_cl1'
order by value;


-- outreach_mode frequency
select x.outreach_mode as outreach_mode_value,
   d.label as outreach_mode_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_mode = d.value
where type_name = 'outreach_mode_cl1'
group by x.outreach_mode;


-- outreach_mode_oth frequency
select outreach_mode_oth, count(*) n 
from outreach 
group by outreach_mode_oth 
order by count(*);


-- OUTREACH_TYPE & OUTREACH_TYPE_OTH ------------------------------------------------


-- outreach_type code list
select *
from xsd_enumeration_definition 
where type_name = 'outreach_type_cl1'
order by value;


-- outreach_type frequency
select x.outreach_type as outreach_type_value,
   d.label as outreach_type_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_type = d.value
where type_name = 'outreach_type_cl1'
group by x.outreach_type;


-- outreach_mode_oth frequency
select outreach_type_oth, count(*) n 
from outreach 
group by outreach_type_oth 
order by outreach_type_oth ;


-- OUTREACH_TAILORED ----------------------------------------------------------------


-- outreach_tailored code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- outreach_tailored frequency
select x.outreach_tailored as outreach_tailored_value,
   d.label as outreach_tailored_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_tailored = d.value
where type_name = 'confirm_type_cl2'
group by x.outreach_tailored;


-- OUTREACH_LANG1, OUTREACH_LANG2, OUTREACH_LANG_OTH --------------------------------

-- outreach_lang1 code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- outreach_lang1 frequency
select x.outreach_lang1 as outreach_lang1_value,
   d.label as outreach_lang1_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_lang1 = d.value
where type_name = 'confirm_type_cl2'
group by x.outreach_lang1;


-- outreach_lang2 code list
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- outreach_lang2 frequency
select x.outreach_lang2 as outreach_lang2_value,
   d.label as outreach_lang2_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_lang2 = d.value
where type_name = 'language_cl2'
group by x.outreach_lang2;

select outreach_lang2, count(*)
from outreach
group by outreach_lang2;

-- DATA ISSUE (reported): why are all outreach_lang2 null, when outreach_lang1 suggust some outreach was language specific?


-- outreach_lang_oth
select outreach_lang_oth, count(*) n 
from outreach 
group by outreach_lang_oth 
order by outreach_lang_oth ;


-- OUTREACH_RACE1, OUTREACH_RACE2, OUTREACH_RACE_OTH --------------------------------


-- outreach_race1 code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl6'
order by value;


-- outreach_race1 frequency
select x.outreach_race1 as outreach_race1_value,
   d.label as outreach_race1_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_race1 = d.value
where type_name = 'confirm_type_cl6'
group by x.outreach_race1;


-- outreach_race2 code list
select *
from xsd_enumeration_definition 
where type_name = 'race_cl3'
order by value;


-- outreach_race2 frequency
select x.outreach_race2 as outreach_race2_value,
   d.label as outreach_race2_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_race2 = d.value
where type_name = 'race_cl3'
group by x.outreach_race2;

select outreach_race2, count(*)
from outreach
group by outreach_race2;

-- DATA ISSUE (reported): outreach_race2 is null, but outreach_race1 suggust some outreach was specific to a race


-- outreach_lang_oth
select outreach_race_oth, count(*) n 
from outreach 
group by outreach_race_oth 
order by outreach_race_oth ;


-- OUTREACH_CULTURE1, OUTREACH_CULTURE2, OUTREACH_CULTURE_OTH -----------------------


-- outreach_culture1 code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl6'
order by value;


-- outreach_culture1 frequency
select x.outreach_culture1 as outreach_culture1_value,
   d.label as outreach_culture1_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_culture1 = d.value
where type_name = 'confirm_type_cl6'
group by x.outreach_culture1;


-- outreach_culture2 code list
select *
from xsd_enumeration_definition 
where type_name = 'culture_cl1'
order by value;


-- outreach_culture2 frequency
select x.outreach_culture2 as outreach_culture2_value,
   d.label as outreach_culture2_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_culture2 = d.value
where type_name = 'culture_cl1'
group by x.outreach_culture2;

select outreach_culture2, count(*)
from outreach
group by outreach_culture2;


-- outreach_culture_oth
select outreach_culture_oth, count(*) n 
from outreach 
group by outreach_culture_oth 
order by outreach_culture_oth;


-- OUTREACH_QUANTITY ----------------------------------------------------------------

select outreach_quantity, count(*) n 
from outreach 
group by outreach_quantity 
order by outreach_quantity;


-- OUTREACH_COST --------------------------------------------------------------------

select outreach_cost, count(*) n 
from outreach 
group by outreach_cost 
order by outreach_cost;


-- OUTREACH_STAFFING ----------------------------------------------------------------

select outreach_staffing, count(*) n 
from outreach 
group by outreach_staffing 
order by outreach_staffing;


-- OUTREACH_INCIDENT ----------------------------------------------------------------

-- outreach_incident code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- outreach_incident frequency
select x.outreach_incident as outreach_incident_value,
   d.label as outreach_incident_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_incident = d.value
where type_name = 'confirm_type_cl2'
group by x.outreach_incident;

select outreach_incident, count(*)
from outreach
group by outreach_incident;


-- INCIDENT_ID ----------------------------------------------------------------------

select incident_id, count(*) n 
from outreach 
group by incident_id 
order by incident_id;


-- OUTREACH_EVAL_RESULT -------------------------------------------------------------


-- outreach_eval_result code list
select *
from xsd_enumeration_definition 
where type_name = 'success_level_cl1'
order by value;


-- outreach_eval_result frequency
select x.outreach_eval_result as outreach_eval_result,
   d.label as eval_result_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_eval_result = d.value
where type_name = 'success_level_cl1'
group by x.outreach_eval_result;

select outreach_eval_result, count(*)
from outreach
group by outreach_eval_result;


-- TRANSACTION_TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from outreach
group by transaction_type;



/*************************************************************************************
 * table: outreach_eval
 *************************************************************************************/

show columns from outreach_eval;
select count(*) n from outreach_eval;

-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency

-- OUTREACH_EVENT_EVAL_ID -----------------------------------------------------------

-- outreach_event_eval_id frequency
select outreach_event_eval_id, count(*) n 
from outreach_eval 
group by outreach_event_eval_id 
order by outreach_event_eval_id;

-- outreach_event_eval_id is unique?
select *
from
	(
		select outreach_event_eval_id, count(*) n 
		from outreach_eval 
		group by outreach_event_eval_id 
		order by outreach_event_eval_id
	) o
where o.n > 1;

-- outreach_event_eval_id is null
select outreach_event_eval_id
from outreach_eval 
where outreach_event_eval_id is null;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------


-- outreach_event_id frequency
select outreach_event_id, count(*) n 
from outreach_eval 
group by outreach_event_id 
order by outreach_event_id;

-- outreach_event_id is unique?
select *
from
	(
		select outreach_event_id, count(*) n 
		from outreach_eval 
		group by outreach_event_id 
		order by outreach_event_id
	) o
where o.n > 1;

-- outreach_event_id is null
select outreach_event_id
from outreach_eval 
where outreach_event_id is null;


-- OUTREACH_EVAL & OUTREACH_EVAL_OTH ------------------------------------------------


-- outreach_eval code list
select *
from xsd_enumeration_definition 
where type_name = 'outreach_eval_cl1'
order by value;


-- outreach_eval frequency
select x.outreach_eval as outreach_eval,
   d.label as outreach_eval_description,
   count(*) as n
from outreach_eval  x left outer join
   xsd_enumeration_definition d on x.outreach_eval = d.value
where type_name = 'outreach_eval_cl1'
group by x.outreach_eval;


-- outreach_eval_oth frequency
select outreach_eval_oth, count(*) n 
from outreach_eval 
group by outreach_eval_oth 
order by outreach_eval_oth;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


 
/*************************************************************************************
 * table: outreach_lang2
 *************************************************************************************/

show columns from outreach_lang2;
select count(*) n from outreach_lang2;

-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- OUTREACH_LANG2_ID ----------------------------------------------------------------


-- outreach_lang2_id frequency
select outreach_lang2_id, count(*) n 
from outreach_lang2
group by outreach_lang2_id 
order by outreach_lang2_id;


-- outreach_lang2_id is unique?
select *
from
	(
		select outreach_lang2_id, count(*) n 
		from outreach_lang2
		group by outreach_lang2_id 
		order by outreach_lang2_id
	) o
where o.n > 1;


-- outreach_lang2_id is null
select outreach_lang2_id
from outreach_lang2 
where outreach_lang2_id is null;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------


-- outreach_event_id frequency
select outreach_event_id, count(*) n 
from outreach_lang2
group by outreach_event_id 
order by outreach_event_id;


-- outreach_event_id is unique?
select *
from
	(
		select outreach_event_id, count(*) n 
		from outreach_lang2
		group by outreach_event_id 
		order by outreach_event_id
	) o
where o.n > 1;


-- outreach_event_id is null
select outreach_event_id
from outreach_lang2 
where outreach_event_id is null;


-- OUTREACH_LANG2 -------------------------------------------------------------------


-- outreach_lang2 code list
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- outreach_lang2 frequency
select x.outreach_lang2 as outreach_lang2,
   d.label as outreach_lang2_description,
   count(*) as n
from outreach_lang2 x left outer join
   xsd_enumeration_definition d on x.outreach_lang2 = d.value
where type_name = 'language_cl2'
group by x.outreach_lang2;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


 
/*************************************************************************************
 * table: outreach_race 
 *************************************************************************************/

show columns from outreach_race;
select count(*) n from outreach_race;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- OUTREACH_RACE_ID -----------------------------------------------------------------

select outreach_race_id, count(*) n
from outreach_race 
group by outreach_race_id
order by outreach_race_id desc;

select *
from outreach_race 
where outreach_race_id is null;

select *
from 
	(
		select outreach_race_id, count(*) n
		from outreach_race 
		group by outreach_race_id
	) o
where o.n > 1;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------

select outreach_event_id, count(*) n
from outreach_race 
group by outreach_event_id
order by outreach_event_id desc;

select *
from outreach_race 
where outreach_event_id is null;

select *
from 
	(
		select outreach_event_id, count(*) n
		from outreach_race 
		group by outreach_race_id
	) o
where o.n > 1;


-- OUTREACH_RACE2 & OUTREACH_RACE_OTH -----------------------------------------------


-- outreach_race2 code list
select *
from xsd_enumeration_definition 
where type_name = 'race_cl3'
order by value;


-- outreach_race2 frequency
select x.outreach_race2 as outreach_race2,
   d.label as outreach_race2_description,
   count(*) as n
from outreach_race x left outer join
   xsd_enumeration_definition d on x.outreach_race2 = d.value
where type_name = 'race_cl3'
group by x.outreach_race2;

select outreach_race2, count(*)
from outreach_race
group by outreach_race2;


-- OUTREACH_RACE_OTH ----------------------------------------------------------------

select outreach_race_oth, count(*) n
from outreach_race 
group by outreach_race_oth
order by outreach_race_oth desc;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 


/*************************************************************************************
 * table: outreach_staff
 *************************************************************************************/

show columns from outreach_staff;
select count(*) n from outreach_staff;

-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- OUTREACH_EVENT_STAFF_ID ----------------------------------------------------------

select outreach_event_staff_id, count(*) n
from outreach_staff 
group by outreach_event_staff_id
order by outreach_event_staff_id desc;

select *
from outreach_staff 
where outreach_event_staff_id is null;

select *
from 
	(
		select outreach_event_staff_id, count(*) n
		from outreach_staff 
		group by outreach_event_staff_id
	) o
where o.n > 1;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------


select outreach_event_id, count(*) n
from outreach_staff 
group by outreach_event_id;

select *
from outreach_staff 
where outreach_event_id is null;

select *
from 
	(
		select outreach_event_id, count(*) n
		from outreach_staff 
		group by outreach_event_id
	) o
where o.n > 1;


-- STAFF_ID -------------------------------------------------------------------------


select outreach_staff_id, count(*) n
from outreach_staff 
group by outreach_staff_id
order by outreach_staff_id desc;

select *
from outreach_staff 
where outreach_staff_id is null;

select *
from 
	(
		select outreach_staff_id, count(*) n
		from outreach_staff 
		group by outreach_staff_id
	) o
where o.n > 1;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency



/*************************************************************************************
 * table: outreach_target
 *************************************************************************************/

show columns from outreach_target;
select count(*) n from outreach_target;

-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- OUTREACH_TARGET_ID ---------------------------------------------------------------

select outreach_target_id, count(*) n
from outreach_target 
group by outreach_target_id
order by count(*);

select *
from outreach_target 
where outreach_target_id is null;

select *
from 
	(
		select outreach_target_id, count(*) n
		from outreach_target 
		group by outreach_target_id
	) o
where o.n > 1;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------


select outreach_event_id, count(*) n
from outreach_target 
group by outreach_event_id
order by count(*);

select *
from outreach_target 
where outreach_event_id is null;

select *
from 
	(
		select outreach_event_id, count(*) n
		from outreach_target 
		group by outreach_event_id
	) o
where o.n > 1;


-- OUTREACH_TARGET_MS & OUTREACH_TARGET_MS_OTH --------------------------------------


-- outreach_target_ms code list
select *
from xsd_enumeration_definition 
where type_name = 'outreach_target_cl1'
order by value;


-- outreach_race2 frequency
select x.outreach_target_ms as outreach_target_ms,
   d.label as outreach_target_ms_description,
   count(*) as n
from outreach_target x left outer join
   xsd_enumeration_definition d on x.outreach_target_ms = d.value
where type_name = 'outreach_target_cl1'
group by x.outreach_target_ms;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency



/*************************************************************************************
 *
 * 		STAFF & WEEKLY STAFF EXPENSE
 *
 * 		Staff: 
 * 				staff
 * 				staff_language
 * 				staff_cert_training
 * 				
 * 		Weekly Staff Expense: 
 * 				staff_exp_mngmnt_tasks, 
 * 				staff_exp_data_cllctn_tasks, 
 * 				staff_weekly_expens
 *
 *************************************************************************************/



/*************************************************************************************
 * table: staff
 *************************************************************************************/

show columns from staff;
select count(*) n from staff;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_ID -------------------------------------------------------------------------

-- staff_id frequency
select staff_id, count(*) n
from staff 
group by staff_id
order by staff_id desc;


-- staff_id is null
select *
from staff 
where staff_id is null or staff_id = '' ;


-- staff_id is not unique
select *
from ( 
    select staff_id, count(*) n 
    from staff  
    group by staff_id 
) o
where o.n > 1;


-- STAFF_TYPE & STAFF_TYPE_OTH ------------------------------------------------------
-- (aka labor position)

-- staff_type code list (-5 = Other, -4 = Missing in Error)
select * 
from xsd_enumeration_definition 
where type_name = 'study_staff_type_cl1' 
order by value;


-- staff_type combine list (staff_type & staff_type_oth) frequency 
	-- staff_type (-5 = Other, -4 = Missing in Error)
	-- staff_type_oth (-7 = Not Applicable)
select x.staff_type as staff_type_value,
   d.label as staff_type_description,
   if(x.staff_type_oth = -7, 'Not Applicable', x.staff_type_oth) as staff_type_oth,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_type = d.value
where type_name = 'study_staff_type_cl1'
group by x.staff_type
order by x.staff_type;


-- staff_type view
	-- staff_type (-5 = Other, -4 = Missing in Error)
	-- staff_type_oth (-7 = Not Applicable)
create view staffType as
select x.staff_id,
	if(x.staff_type < 0 and x.staff_type_oth != -7, x.staff_type_oth, convert(x.staff_type, char)) as staff_type_value,
	if(x.staff_type < 0 and x.staff_type_oth != -7, x.staff_type_oth, d.label) as staff_type_description, 
  staff_type_oth
from staff x left outer join
	xsd_enumeration_definition d on x.staff_type = d.value
where type_name = 'study_staff_type_cl1';
-- drop view staffType


-- staff_type integrated list (staff_type & staff_type_oth) frequency 
select staff_type_value, 
	staff_type_description, 
	staff_type_oth, 
	count(*) n
from staffType
group by staff_type_value, staff_type_oth
order by staff_type_description; 


-- staff_id with no staff_type indicated
select s.staff_id, 
    t.staff_type_value, 
    t.staff_type_description
from staff s left outer join 
    staffType t on s.staff_id = t.staff_id 
where t.staff_type_value is null or t.staff_type_value = '';


-- SUBCONTRACTOR --------------------------------------------------------------------


-- subcontractor code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- subcontractor frequency (-4 = Missing in Error)
select x.subcontractor as subcontractor_value,
   d.label as subcontractor_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.subcontractor = d.value
where type_name = 'confirm_type_cl2'
group by x.subcontractor
order by d.value;


-- STAFF_YOB ------------------------------------------------------------------------


-- staff_yob frequency
select staff_yob, count(*) n
from staff 
group by staff_yob
order by staff_yob desc;
-- MDES ISSUE (reported): what does a year of that 9666 (n=29) mean?


-- STAFF_AGE_RANGE ------------------------------------------------------------------


-- staff_age_range code list (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'age_range_cl1'
order by value;


-- staff_age_range frequency (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
select x.staff_age_range as staff_age_range_value,
   d.label as staff_age_range_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_age_range = d.value
where type_name = 'age_range_cl1'
group by x.staff_age_range
order by d.value;
-- DATA ISSUE (reported): is 'Missing in Error' staff_age_range (n=25) acceptable?


-- STAFF_GENDER ---------------------------------------------------------------------


-- staff_gender code list (-6 = Unknown, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'gender_cl1'
order by value;


-- staff_gender frequency (-6 = Unknown, -4 = Missing in Error)
select x.staff_gender as staff_gender_value,
   d.label as staff_gender_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_gender = d.value
where type_name = 'gender_cl1'
group by x.staff_gender;
-- DATA ISSUE (reported): is 'Missing in Error" staff_gender (n=25) acceptable?


-- STAFF_RACE & STAFF_RACE_OTH ------------------------------------------------------


-- staff_race code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'race_cl1'
order by value;
-- DATA ISSUE (reported): what is the difference between UNKNOWN and MISSING IN ERROR staff_race?  


-- staff_race combined list (staff_race + staff_race_oth)
	-- staff_race: -6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused
	-- staff_race_oth: -7 = Not Applicable
select x.staff_race as staff_race_value,
   d.label as staff_race_description,
   if(x.staff_race_oth = -7, 'Not Applicable', x.staff_race_oth) as staff_race_oth,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_race = d.value
where type_name = 'race_cl1'
group by x.staff_race
order by x.staff_race;


-- staff_race view
	-- staff_race: -6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused
	-- staff_race_oth: -7 = Not Applicable
create view staffRace as
select x.staff_id,
	if(x.staff_race < -1 and x.staff_race_oth != -7, x.staff_race_oth, convert(x.staff_race, char)) as staff_race_value,
	if(x.staff_race < -1 and x.staff_race_oth != -7, x.staff_race_oth, d.label) as staff_race_description, 
  staff_race_oth
from staff x left outer join
	xsd_enumeration_definition d on x.staff_race = d.value
where type_name = 'race_cl1';
-- drop view staffType


-- staff_race integrated list (staff_race & staff_race_oth) frequency 
select staff_race_value, 
	staff_race_description, 
	staff_race_oth, 
	count(*) n
from staffRace
group by staff_race_value, staff_race_oth
order by staff_race_description; 


-- STAFF_ZIP ------------------------------------------------------------------------


select if(staff_zip = -7, 'Not Applicable', staff_zip) staff_zip,
	count(*) n
from staff 
group by staff_zip
order by staff_zip desc;


-- STAFF_ETHNICITY ------------------------------------------------------------------


-- staff_ethnicity code list
select *
from xsd_enumeration_definition 
where type_name = 'ethnicity_cl1'
order by value;
-- MDES ISSUE (reported): what is the difference between staff_ethnicity UNKNOWN and MISSING IN ERROR 


-- staff_ethnicity frequency
select x.staff_ethnicity as staff_ethnicity_value,
   d.label as staff_ethnicity_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_ethnicity = d.value
where type_name = 'ethnicity_cl1'
group by x.staff_ethnicity;


-- STAFF_EXP ------------------------------------------------------------------------


-- staff_exp code list
select *
from xsd_enumeration_definition 
where type_name = 'experience_level_cl1'
order by value;


-- staff_exp frequency
select x.staff_exp as staff_exp_value,
   d.label as staff_exp_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_exp = d.value
where type_name = 'experience_level_cl1'
group by x.staff_exp;


-- STAFF_COMMENT --------------------------------------------------------------------


select staff_comment, count(*) n
from staff 
group by staff_comment
order by staff_comment desc;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency



/*************************************************************************************
 * table: staff_cert_training
 *************************************************************************************/


show columns from staff_cert_training;
select count(*) n from staff_cert_training;
select * from staff_cert_training;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_CERT_LIST_ID ---------------------------------------------------------------


-- staff_cert_list_id frequency
select staff_cert_list_id, count(*) n
from staff_cert_training
group by staff_cert_list_id
order by staff_cert_list_id desc;
-- DATA QUESTION: the prefixe of a staff_cert_list_id is the staff_id, what does the rest of the id represent.


-- staff_cert_list_id is not unique
select * 
from
	(
		select staff_cert_list_id, count(*) n
		from staff_cert_training
		group by staff_cert_list_id
		order by staff_cert_list_id desc
	) c
where n > 1	;


-- STAFF_ID -------------------------------------------------------------------------


select staff_id, count(*) n
from staff_cert_training
group by staff_id
order by staff_id desc;


-- CERT_TRAIN_TYPE ------------------------------------------------------------------


-- cert_train_type code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'certificate_type_cl1'
order by value;


-- cert_train_type frequency
select x.cert_train_type as cert_train_type_value,
   d.label as cert_train_type_description,
   count(*) as n
from staff_cert_training x left outer join
   xsd_enumeration_definition d on x.cert_train_type = d.value
where type_name = 'certificate_type_cl1'
group by x.cert_train_type;


-- cert_train_type is missing
select *
from staff_cert_training 
where cert_train_type is null or cert_train_type = '';


-- CERT_COMPLETED -------------------------------------------------------------------


-- cert_completed code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- cert_completed frequency
select x.cert_completed as cert_completed_value,
   d.label as cert_completed_description,
   count(*) as n
from staff_cert_training x left outer join
   xsd_enumeration_definition d on x.cert_completed = d.value
where type_name = 'confirm_type_cl2'
group by x.cert_completed;


-- cert_completed is missing
select *
from staff_cert_training
where cert_completed is null or cert_completed = '';


-- CERT_DATE ------------------------------------------------------------------------


-- Missing cert_date when cert_completed = 1 (Yes)
select *
from staff_cert_training
where (cert_completed = 1) and (cert_date is null or cert_date = '');


-- STAFF_BGCHECK_LVL ----------------------------------------------------------------


-- staff_bgcheck_lvl code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'background_chck_lvl_cl1'
order by value;


-- staff_bgcheck_lvl frequency
select x.staff_bgcheck_lvl as staff_bgcheck_lvl_value,
   d.label as staff_bgcheck_lvl_description,
   count(*) as n
from staff_cert_training x left outer join
   xsd_enumeration_definition d on x.staff_bgcheck_lvl = d.value
where type_name = 'background_chck_lvl_cl1'
group by x.staff_bgcheck_lvl;
-- DATA ISSUE (reported): is staff_bgcheck_lvl of MISSING IN ERROR (n=506) acceptable?


-- cert_train_type that do have staff_bgcheck_lvl
select b.cert_train_type_value,
	d.label as cert_train_type_description,
	b.staff_bgcheck_lvl_value,
	b.staff_bgcheck_lvl_description 			
from
	(
		select x.cert_train_type as cert_train_type_value, 
			x.staff_bgcheck_lvl as staff_bgcheck_lvl_value,
			d.label as staff_bgcheck_lvl_description 
		from staff_cert_training x left outer join
		   xsd_enumeration_definition d on x.staff_bgcheck_lvl = d.value
		where d.type_name = 'background_chck_lvl_cl1' and x.staff_bgcheck_lvl != -4
		group by x.cert_train_type, x.staff_bgcheck_lvl
	) b left outer join
	xsd_enumeration_definition d on b.cert_train_type_value = d.value
where d.type_name = 'certificate_type_cl1';
-- DATA ISSUE (reported): is it possible that a cert_train_type can have multiple staff_bgcheck_lvl?


-- CERT_TYPE_FREQUENCY --------------------------------------------------------------


-- cert_type_frequency frequency
select cert_type_frequency, count(*) n
from staff_cert_training
group by cert_type_frequency
order by cert_type_frequency desc;


-- cert_train_type that do have a cert_type_frequency
select cert_train_type, cert_type_frequency
from staff_cert_training
where cert_type_frequency != 'NA'
group by cert_train_type, cert_type_frequency;


-- CERT_TYPE_EXP_DATE ---------------------------------------------------------------


-- cert_type_exp_date of '2050-01-01' means certification does not expeire
select cert_type_exp_date, count(*) n
from staff_cert_training
group by cert_type_exp_date
order by cert_type_exp_date desc;
-- DATA ISSUE (reported): what does a cert_type_exp_date of '9777-97-97' mean?


-- CERT_COMMENT ---------------------------------------------------------------------

select cert_comment, count(*) n
from staff_cert_training
group by cert_comment
order by cert_comment desc;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency



/*************************************************************************************
 * table: staff_language
 *************************************************************************************/
  

show columns from staff_language;
select count(*) n from staff_language;
select * from staff_language;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_LANGUAGE_ID ----------------------------------------------------------------


-- staff_language_id frequency
-- looks like staff_language_id comprise of staff_id + psu_id + staff_lang
select staff_language_id, count(*) n
from staff_language
group by staff_language_id
order by staff_language_id desc;


-- staff_language_id is not unique
select * 
from
	(
		select staff_language_id, count(*) n
		from staff_language
		group by staff_language_id
	) l
where l.n > 1;


-- STAFF_ID -------------------------------------------------------------------------

-- staff_id frequency
select staff_id, count(*) n
from staff_language
group by staff_id
order by staff_id desc;


-- staff_id listed more than once
select * 
from
	(
		select staff_id, count(*) n
		from staff_language
		group by staff_id
		order by staff_id desc
	) l
where l.n > 1;

-- are there any duplicated staff_id, staff_lang?
select * 
from
	(
		select staff_id, staff_lang, count(*) n
		from staff_language
		group by staff_id, staff_lang
		order by staff_id desc
	) l
where l.n > 1;


-- STAFF_LANG & STAFF_LANG_OTH ------------------------------------------------------


-- staff_lang code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- staff_lang combine list (staff_lang & staff_lang_oth) frequency 
	-- staff_lang (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
	-- staff_lang_oth (-7 = Not Applicable)
select x.staff_lang as staff_lang_value,
   d.label as staff_lang_description,
   x.staff_lang_oth,
   count(*) as n
from staff_language x left outer join
   xsd_enumeration_definition d on x.staff_lang = d.value
where d.type_name = 'language_cl2'
group by x.staff_lang, x.staff_lang_oth;


-- staff_lang view
	-- staff_lang (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
	-- staff_lang_oth (-7 = Not Applicable)
create view staffLang as
select x.staff_id,
	if(x.staff_lang < -1 and x.staff_lang_oth != -7, x.staff_lang_oth, convert(x.staff_lang, char)) as staff_lang_value,
	if(x.staff_lang < -1 and x.staff_lang_oth != -7, x.staff_lang_oth, d.label) as staff_lang_description, 
  staff_lang_oth
from staff_language x left outer join
	xsd_enumeration_definition d on x.staff_lang = d.value
where d.type_name = 'language_cl2';
-- drop view staffLang


-- staff_lang integrated list (staff_type & staff_type_oth) frequency 
select staff_lang_value, staff_lang_description, staff_lang_oth, count(*)
from staffLang 
group by staff_lang_value, staff_lang_description, staff_lang_oth;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


/*************************************************************************************
 * table: staff_weekly_expense
 *************************************************************************************/


show columns from staff_weekly_expense;
select count(*) n from staff_weekly_expense;
select * from staff_weekly_expense;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- WEEKLY_EXP_ID --------------------------------------------------------------------


-- weekly_exp_id frequency
select weekly_exp_id, count(*) n
from staff_weekly_expense
group by weekly_exp_id
order by weekly_exp_id desc;
-- DATA ISSUE (reported): weekly_exp_id does not follow the same convention. 
	-- There seems to be two convention types: 20000048_995 and 20000048_NCS3LS13_2010-10-17, 
	-- the later being the psu + staff_id + week_start_date


-- weekly_exp_id is not unique
select * 
from
	(
		select weekly_exp_id, count(*) n
		from staff_weekly_expense
		group by weekly_exp_id
	) e
where e.n > 1;


-- STAFF_ID -------------------------------------------------------------------------


-- staff_id frequency
select staff_id, count(*) n
from staff_weekly_expense
group by staff_id
order by count(*) desc;


-- The same staff is listed more than once for the same weekly_exp_id
select * 
from
	(
		select weekly_exp_id, staff_id, count(*) n
		from staff_weekly_expense
		group by weekly_exp_id, staff_id
	) e
where e.n > 1;


-- WEEK_START_DATE ------------------------------------------------------------------


-- week_start_date frequency
select week_start_date, count(*) n
from staff_weekly_expense
group by week_start_date
order by week_start_date;


-- TODO: all week_start_date values are legitimate dates


-- STAFF_PAY ------------------------------------------------------------------------


-- staff_pay frequency
select staff_pay, count(*) n
from staff_weekly_expense
group by staff_pay
order by staff_pay desc;


-- STAFF_HOURS ----------------------------------------------------------------------


-- staff_hours frequency
select staff_hours, count(*) n
from staff_weekly_expense
group by staff_hours
order by staff_hours desc;
-- DATA ISSUE (reported): is it possibe to have zero staff_hours here (n=12)?

-- STAFF_EXPENSES -------------------------------------------------------------------


-- staff_expenses
select staff_expenses, count(*) n
from staff_weekly_expense
group by staff_expenses
order by staff_expenses desc;
-- DATA ISSUE (reported): is it possible to have zero staff_expenses (n=6796)?


-- STAFF_MILES ----------------------------------------------------------------------


-- staff_miles
select staff_miles, count(*) n
from staff_weekly_expense
group by staff_miles
order by staff_miles desc;


-- WEEKLY_EXPENSES_COMMENT ----------------------------------------------------------

select weekly_expenses_comment, count(*) n
from staff_weekly_expense
group by weekly_expenses_comment
order by weekly_expenses_comment desc;
-- DATA ISSUE (reported): what does weekly_expenses_comment of -7 mean?


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency



/*************************************************************************************
 * table: staff_exp_data_cllctn_tasks
 *************************************************************************************/

show columns from staff_exp_data_cllctn_tasks;
select count(*) n from staff_exp_data_cllctn_tasks;
select * from staff_exp_data_cllctn_tasks;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_EXP_DATA_COLL_TASK_ID ------------------------------------------------------

-- DATA ISSUE (reported): how is the staff (staff_id) linked data in this table?  
-- DATA ISSUE (reported): what is the makeup of the staff_exp_data_coll_task_id (psu_id + staff_id + what date?)?


-- staff_exp_data_coll_task_id frequency
select staff_exp_data_coll_task_id, count(*) n
from staff_exp_data_cllctn_tasks
group by staff_exp_data_coll_task_id
order by staff_exp_data_coll_task_id desc;
-- ?? DATA ISSUE: what is the makeup of the staff_weekly_expense_id because it does not seem consistent (e.g., 20000048_RCSU90_2011-09-11, 20000048_1020)


-- staff_exp_data_coll_task_id is not unique
select *
from 
	(
		select staff_exp_data_coll_task_id, count(*) n
		from staff_exp_data_cllctn_tasks
		group by staff_exp_data_coll_task_id
		order by staff_exp_data_coll_task_id desc
	) t
where t.n > 1;


-- STAFF_WEEKLY_EXPENSE_ID ----------------------------------------------------------


-- staff_weekly_expense_id frequency
select staff_weekly_expense_id, count(*) n
from staff_exp_data_cllctn_tasks
group by staff_weekly_expense_id
order by staff_weekly_expense_id desc;
-- ?? DATA ISSUE: what is the makeup of the staff_weekly_expense_id because it does not seem consistent (e.g., 20000048_RCSU90_2011-09-11, 20000048_1020)


-- staff_exp_data_coll_task_id compared to staff_weekly_expense_id
select staff_exp_data_coll_task_id, staff_weekly_expense_id
from staff_exp_data_cllctn_tasks
where staff_exp_data_coll_task_id = staff_weekly_expense_id
group by staff_exp_data_coll_task_id, staff_weekly_expense_id
order by count(*) desc;
-- DATA ISSUE (reported): why is select staff_exp_data_coll_task_id the same as the staff_weekly_expense_id?


-- DATA_COLL_TASK_TYPE & DATA_COLL_TASK_TYPE_OTH ------------------------------------


-- data_coll_task_type code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'study_data_cllctn_tsk_type_cl1'
order by value;


-- data_coll_task_type combine list (data_coll_task_type & data_coll_task_type_oth) frequency
	-- data_coll_task_type (-5 = Other, -4 = Missing in Error)
	-- data_coll_task_type_oth (-7 = Not Applicable)
select x.data_coll_task_type as data_coll_task_type_value,
   d.label as data_coll_task_type_description,
   data_coll_task_type_oth,
   count(*) as n
from staff_exp_data_cllctn_tasks x left outer join
   xsd_enumeration_definition d on x.data_coll_task_type = d.value
where d.type_name = 'study_data_cllctn_tsk_type_cl1'
group by x.data_coll_task_type, data_coll_task_type_oth
order by x.data_coll_task_type;
-- DATA ISSUE (reported): what is the difference between data_coll_task_type_oth 'Administrative task' versus 'Administrative tasks', and 'Trainimg' and 'Training'
-- MDES ISSUE (reported): what does data_coll_task_type_oth = -4 mean?


-- data_coll_task_type view
	-- data_coll_task_type (-5 = Other, -4 = Missing in Error)
	-- data_coll_task_type_oth (-7 = Not Applicable)
alter view dataCollTaskType as
select x.staff_exp_data_coll_task_id,
	if(x.data_coll_task_type < 0 and x.data_coll_task_type_oth != -7, x.data_coll_task_type_oth, convert(x.data_coll_task_type, char)) as data_coll_task_type_value,
	if(x.data_coll_task_type < 0 and x.data_coll_task_type_oth != -7, x.data_coll_task_type_oth, d.label) as data_coll_task_type_description, 
	data_coll_task_type_oth
from staff_exp_data_cllctn_tasks x left outer join
	xsd_enumeration_definition d on x.data_coll_task_type = d.value
where d.type_name = 'study_data_cllctn_tsk_type_cl1';


-- data_coll_task_type integrated list (data_coll_task_type & data_coll_task_type_oth) frequency 
	-- data_coll_task_type (-5 = Other, -4 = Missing in Error)
	-- data_coll_task_type_oth (-7 = Not Applicable)
select data_coll_task_type_value, 
	data_coll_task_type_description, 
	data_coll_task_type_oth, 
	count(*) n
from dataCollTaskType
group by data_coll_task_type_value, data_coll_task_type_oth
order by data_coll_task_type_value; 


-- DATA_COLL_TASKS_HRS --------------------------------------------------------------


-- data_coll_tasks_hrs frequency
select data_coll_tasks_hrs, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_tasks_hrs
order by data_coll_tasks_hrs;
-- DATA ISSUE (reported): what data_coll_tasks_hrs = -4 mean?


-- which staff_exp_data_coll_task_id does not have reported data_coll_tasks_hrs?
select * 
from staff_exp_data_cllctn_tasks
where data_coll_tasks_hrs is null or data_coll_tasks_hrs = '';


-- DATA_COLL_TASK_CASES -------------------------------------------------------------

select data_coll_task_cases, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_task_cases
order by data_coll_task_cases desc;
-- DATA ISSUE (reported): what does data_coll_task_cases = -4 mean?


-- DATA_COLL_TRANSMIT ---------------------------------------------------------------

select data_coll_transmit, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_transmit
order by data_coll_transmit desc;
-- DATA ISSUE (reported): what does data_coll_transmit = -7 mean?


-- DATA_COLL_TASK_COMMENT -----------------------------------------------------------

select data_coll_task_comment, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_task_comment
order by data_coll_task_comment desc;
-- DATA ISSUE (reported): what does data_coll_task_comment = -7 mean?


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 

/*************************************************************************************
 * table: staff_exp_mngmnt_tasks
 *************************************************************************************/


show columns from staff_exp_mngmnt_tasks;
select count(*) n from staff_exp_mngmnt_tasks;
select * from staff_exp_mngmnt_tasks;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_EXP_MGMT_TASK_ID -----------------------------------------------------------


-- staff_exp_mgmt_task_id frequency
select staff_exp_mgmt_task_id, count(*) n
from staff_exp_mngmnt_tasks
group by staff_exp_mgmt_task_id
order by staff_exp_mgmt_task_id desc;
-- DATA ISSUE: staff_exp_mgmt_task_id does not consistently follow the same convention


-- staff_exp_mgmt_task_id is not unique
select *
from 
	(
		select staff_exp_mgmt_task_id, count(*) n
		from staff_exp_mngmnt_tasks
		group by staff_exp_mgmt_task_id
	) mt
where mt.n > 1;


-- STAFF_WEEKLY_EXPENSE_ID ----------------------------------------------------------


-- staff_weekly_expense_id frequency
select staff_weekly_expense_id, count(*) n
from staff_exp_mngmnt_tasks
group by staff_weekly_expense_id
order by staff_weekly_expense_id desc;
-- DATA ISSUE (reported): staff_weekly_expense_id does not consistently follow the same convention


-- MGMT_TASK_TYPE & MGMT_TASK_TYPE_OTH ----------------------------------------------


-- mgmt_task_type code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'study_mngmnt_tsk_type_cl1'
order by value;


-- mgmt_task_type combine list (mgmt_task_type & mgmt_task_type_oth) frequency
	-- mgmt_task_type (-5 = Other, -4 = Missing in Error)
	-- mgmt_task_type_oth (-7 = Not Applicable)
select x.mgmt_task_type as mgmt_task_type_value,
   d.label as mgmt_task_type_description,
   mgmt_task_type_oth, 
   count(*) as n
from staff_exp_mngmnt_tasks x left outer join
   xsd_enumeration_definition d on x.mgmt_task_type = d.value
where d.type_name = 'study_mngmnt_tsk_type_cl1'
group by x.mgmt_task_type, mgmt_task_type_oth
order by count(*) desc;
-- DATA ISSUE (reported): what is mgmt_task_type_oth of -4 (n=44)?


-- mgmt_task_type view
	-- mgmt_task_type (-5 = Other, -4 = Missing in Error)
	-- mgmt_task_type_oth (-7 = Not Applicable)
alter view mgmtTaskType as
select x.staff_exp_mgmt_task_id,
	if(x.mgmt_task_type < 0 and x.mgmt_task_type_oth != -4 and x.mgmt_task_type_oth != -7, x.mgmt_task_type_oth, convert(x.mgmt_task_type, char)) as mgmt_task_type_value,
	if(x.mgmt_task_type < 0 and x.mgmt_task_type_oth != -4 and x.mgmt_task_type_oth != -7, x.mgmt_task_type_oth, d.label) as mgmt_task_type_description, 
  mgmt_task_type_oth
from staff_exp_mngmnt_tasks x left outer join
	xsd_enumeration_definition d on x.mgmt_task_type = d.value
where d.type_name = 'study_mngmnt_tsk_type_cl1';


-- mgmt_task_type integrated list (mgmt_task_type & mgmt_task_type_oth) frequency 
select mgmt_task_type_value, 
	mgmt_task_type_description, 
	mgmt_task_type_oth, 
	count(*) n
from mgmtTaskType
group by mgmt_task_type_value, mgmt_task_type_oth
order by mgmt_task_type_description; 


-- MGMT_TASK_HRS --------------------------------------------------------------------


-- mgmt_task_hrs freqency
select mgmt_task_hrs, count(*) n
from staff_exp_mngmnt_tasks
group by mgmt_task_hrs
order by mgmt_task_hrs desc;


-- MGMT_TASK_COMMENT ----------------------------------------------------------------


-- mgmt_task_comment freqency
select mgmt_task_comment, count(*) n
from staff_exp_mngmnt_tasks
group by mgmt_task_comment
order by mgmt_task_comment desc;
-- DATA ISSUE (reported): what does a mgmt_task_comment of -7 mean?


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 


