Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select * from three_mth_mother_race;

/*************************************************************************************
 * TABLES IN DB
 *************************************************************************************/


-- number of  tables in db 
select count(*) 
from information_schema.tables 
where table_schema = 'ncs_mdes_prod' 
    and table_type = 'BASE TABLE' 
    and table_name != 'table_row_count';

select count(*) 
from information_schema.tables 
where table_schema = 'ncs_mdes_6_04' 
    and table_type = 'BASE TABLE' 
    and table_name != 'table_row_count';


-- row count per table in db 
select table_name,
    ncs_mdes_prod AS t0, 
    ncs_mdes_6_04 AS t1, 
    convert(ncs_mdes_6_04 - ncs_mdes_prod, SIGNED) as diff
from ncs_mdes_prod.table_row_count
where convert(ncs_mdes_6_04 - ncs_mdes_prod, SIGNED) < 0
order by ncs_mdes_prod desc ;


-- detail of table structure per table in db
Use ncs_mdes_prod;
Use ncs_mdes_6_04;
select * from information_schema.tables where table_schema = 'ncs_mdes_prod';

-- code list
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

show columns from xsd_enumeration_definition;
select count(*) n from xsd_enumeration_definition;

-- compare code list between two periods
select * 
from
    (
        select * 
        from ncs_mdes_prod.xsd_enumeration_definition
    ) t0 left outer join
    (
        select * 
        from ncs_mdes_6_04.xsd_enumeration_definition
    ) t1 on t0.id = t1.id
where t0.description != t1.description
    or t0.global_value != t1.global_value
    or t0.label != t1.label 
    or t0.master_cl != t1.master_cl 
    or t0.value != t1.value 
    or t0.class != t1.class
    or t0.type_name != t1.type_name 
;



/*************************************************************************************
 *
 * 		CREATE INDEXES
 *
 *************************************************************************************/



-- ISSUE: mysql does not have a built in IsDate function. May need to build one or is this part of the import process since it is using grails?
-- SUGGUESTIONS: 
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

Use ncs_mdes_prod;
Use ncs_mdes_6_04;
select count(*) n from participant; 
-- ISSUE T1 (t0 = 3853, t1 = 3909, +56)

select * from participant;


-- PSU_ID ---------------------------------------------------------------------------


-- psu_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where d.type_name = 'psu_cl1'
group by p.psu_id;


-- P_ID -----------------------------------------------------------------------------


-- multiple p_ids? 
Use ncs_mdes_prod;
Use ncs_mdes_6_04;
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
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select * 
from xsd_enumeration_definition 
where type_name = 'participant_type_cl1'
order by value;


-- p_type combine list (p_type & p_type_oth) frequency
    -- p_type code (-5 = Other, -4 = Missing in Error)
    -- p_type_oth (-7 = 'Not Applicable')
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select x.p_type as p_type_value,
   d.label as p_type_description,
   p_type_oth,
   count(*) as n
from participant x left outer join
   xsd_enumeration_definition d on x.p_type = d.value
where d.type_name = 'participant_type_cl1'
group by x.p_type, p_type_oth
order by x.p_type;
-- ISSUE (reported): p_type of NOT APPLICABLE (n=37) and UNKNOWN (n=488)
-- ISSUE T1: p_type of NOT APPLICABLE (n=37) and UNKNOWN (n=493)


-- TODO: does participant.p_type = 'NCS Child)'(6) match up with link_person_participant.relation = 'Child' (8)


-- TODO: how does participant.p_type (study eligibility) compare to ppg_details.ppg_pid_status?


-- STATUS_INFO_SOURCE & STATUS_INFO_SOURCE_OTH --------------------------------------


-- status_info_source code list (-5 = Other, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl4'
order by value;


-- status_info_source frequency
    -- status_info_source (-5 = Other, -4 = Missing in Error)
    -- status_info_source_oth (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.status_info_source as status_info_source_value,
   d.label as status_info_source_description,
    p.status_info_source_oth, 
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.status_info_source = d.value
where d.type_name = 'information_source_cl4'
group by p.status_info_source, p.status_info_source_oth;


-- TODO: participant with a negative status (status_info_source + status_info_source_oth) 


-- STATUS_INFO_MODE & STATUS_INFO_MODE_OTH -------------------------------------------


-- status_info_mode code list  (-5 = Other, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;
select *
from xsd_enumeration_definition 
where type_name = 'contact_type_cl1'
order by value;


-- status_info_mode combined list frequency
    -- status_info_mode (-5 = Other, -4 = Missing in Error)
    -- status_info_mode_oth (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;
select p.status_info_mode as status_info_mode_value,
   d.label as status_info_mode_description,
   p.status_info_mode_oth, 
    count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.status_info_mode = d.value
where d.type_name = 'contact_type_cl1'
group by p.status_info_mode, p.status_info_mode_oth;


-- TODO: list any status_info_mode code that is negative in comprehensive list (status_info_mode + status_info_mode_oth)


-- STATUS_INFO_DATE -----------------------------------------------------------------


-- status_info_date frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select status_info_date, count(*) n 
from participant 
group by status_info_date 
order by status_info_date;


-- which participant does not have a status_info_date?
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p_id
from participant 
where status_info_date is null or status_info_date = '';


-- status_info_date oddity
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from participant 
where (status_info_date REGEXP '^9' or status_info_date REGEXP '-9+');
-- ISSUE (reported): what is a status_info_date that contains '-92' (n=1)?
-- ISSUE T1: what is a status_info_date that contains '-92' (n=1)?


-- ENROLL_STATUS --------------------------------------------------------------------


-- enroll_status code list (-4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select * 
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- enroll_status frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.enroll_status as enroll_status_value,
   d.label as enroll_status_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.enroll_status = d.value
where d.type_name = 'confirm_type_cl2'
group by p.enroll_status;


-- ENROLL_DATE ----------------------------------------------------------------------


-- enroll_date frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select enroll_date, count(*) n 
from participant 
group by enroll_date 
order by count(*) desc;


-- enroll_date oddity
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select enroll_date, count(*) n 
from participant 
where (enroll_date REGEXP '^9' or enroll_date REGEXP '-9+');
-- ISSUE (reported): what is enroll_date of 9777-97-97 (n=3485)?
-- ISSUE T1: what is enroll_date of 9777-97-97 (n=3503)?


-- participant with ENROLL_STATUS = yes (1), is missing ENROLL_DATE or has an invalid ENROLL_DATE
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p_id, enroll_status, enroll_date 
from participant 
where enroll_status = 1 
    and (enroll_date is null or enroll_date = '' or enroll_date = '9777-97-97');


-- participant with ENROLL_STATUS = no (2), but has an ENROLL_DATE
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from participant 
where enroll_status = 2 
    and (not enroll_date is null or enroll_date != '') 
    and (enroll_date != '9777-97-97');


-- PID_ENTRY & PID_ENTRY_OTHER ------------------------------------------------------


-- pid_entry code list (-5 = Other, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition d 
where type_name = 'study_entry_method_cl1'
order by value;


-- pid_entry combined list frequency
    -- pid_entry (-5 = Other, -4 = Missing in Error)
    -- pid_entry_other (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.pid_entry as pid_entry_value,
   d.label as pid_entry_description,
    p.pid_entry_other, 
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.pid_entry = d.value
where d.type_name = 'study_entry_method_cl1'
group by p.pid_entry, p.pid_entry_other;
-- ISSUE (reported): for 3778/3853 participants, their p_entry is -4 (Missing in Error) and p_entry_other is -7 (Not Applicable) 
-- ISSUE t1: looks like t0 issue is resolved


-- PID_AGE_ELIG ---------------------------------------------------------------------

-- pid_age_elig frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.pid_age_elig as pid_age_elig_value,
   d.label as pid_age_elig_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.pid_age_elig = d.value
where d.type_name = 'age_eligible_cl2'
group by p.pid_age_elig
order by p.pid_age_elig;
-- ISSUE: why do some participants pid_age_elig is 
-- 'Not Applicable' (n=75), 
-- 'Unknown' (n=16)
-- 'Missing in Error' (n=15)
-- 'Over Age 49' (n=3)
-- 'Ineligible - Younger than age of Majority' (n=1)
-- Is it because participant is not a pregnant women, but rather, the child, father, etc.


-- does participant's p_type corroborate with pid_age_elig (e.g., father would have pid_age_elig of "Not Applicable")
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select pid_comment, count(*) n
from participant
group by pid_comment;


-- TRANSACTION TYPE -----------------------------------------------------------------
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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

Use ncs_mdes_prod;
Use ncs_mdes_6_04;

show columns from link_person_participant;

select count(*) n from link_person_participant;

select * from link_person_participant;


-- PSU_ID ---------------------------------------------------------------------------

-- psu_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select l.psu_id as psu_id_value, d.label as psu_id_description, count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.psu_id = d.value
where d.type_name = 'psu_cl1'
group by l.psu_id;


-- PERSON_PID_ID --------------------------------------------------------------------

-- person_pid_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_pid_id, count(*) n
from link_person_participant 
group by person_pid_id;


-- person_pid_id is not unique
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from 
    ( 
        select person_pid_id, count(*) n 
        from link_person_participant  
        group by person_pid_id 
    ) l
where l.n > 1;


-- person_pid_id is null
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from link_person_participant 
where person_pid_id is null or person_pid_id = '';


-- P_ID -----------------------------------------------------------------------------


-- p_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p_id, count(*) n 
from link_person_participant 
group by p_id 
order by count(*) desc;


-- p_id is not unique 
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from link_person_participant 
where p_id is null or p_id = '';


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_id, count(*) n
from link_person_participant 
group by person_id 
order by count(*) desc; 


-- person_id is null
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_id
from link_person_participant 
where person_id is null or person_id = ''
order by person_id; 


-- person_id is not unique
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select l.person_id, l.n
from
    (
        select person_id, count(*) n
        from link_person_participant 
        group by person_id 
    ) l
where l.n > 1; 


-- RELATION & RELATION_OTH ----------------------------------------------------------


-- relation code list (-5 = Other, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'person_partcpnt_reltnshp_cl1'
order by value;


-- relation combined list frequency
    -- relation (-5 = Other, -4 = Missing in Error)
    -- relation_oth (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select l.relation as relation_value,
   d.label as relation_description,
    l.relation_oth, 
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.relation = d.value
where d.type_name = 'person_partcpnt_reltnshp_cl1'
group by l.relation, l.relation_oth;
-- ISSUE (reported): person to p_id relationship are 'Not Applicable' (n=9)
-- ISSUE t1: person to p_id relationship are 'Not Applicable' (n=9)


-- IS_ACTIVE ------------------------------------------------------------------------


-- is_active code list (-4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- is_active frequency (-4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select l.is_active as is_active_value,
   d.label as relation_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where d.type_name = 'confirm_type_cl2'
group by l.is_active;


-- person_participant link is NOT ACTIVE or NULL
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select l.is_active as is_active_value,
   d.label as relation_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where (d.type_name = 'confirm_type_cl2')
	and (l.is_active != 1 or l.is_active is null or l.is_active = '')
group by l.is_active;


-- TRANSACTION TYPE -----------------------------------------------------------------
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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

Use ncs_mdes_prod;
Use ncs_mdes_6_04;

show columns from person;

select count(*) n from person;


-- PSU_ID ---------------------------------------------------------------------------


-- psu_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.psu_id as psu_id_value, d.label as psu_id_description, count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where d.type_name = 'psu_cl1'
group by p.psu_id;


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_id, count(*) 
from person 
group by person_id;
-- ISSUE (reported): odd person_ids of -3 (n=1) and -7 (n=1). 
    -- Why are some ids numeric only (1958907), while others are alphanumeric with a date appended (C7312012-02-24)?
-- ISSUE t1: odd person_ids of -3 (n=1) and -7 (n=1). 


-- person_id is not unique
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from (
  select person_id, count(*) n
  from person
  group by person_id
) p
where p.n > 1;

-- person_id is null
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_id, count(*) 
from person 
where person_id is null or person_id = '';


-- PREFIX ---------------------------------------------------------------------------


-- prefix code list (-7 = Not Applicable, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select * 
from xsd_enumeration_definition 
where type_name = 'name_prefix_cl1'
order by value;


-- prefix frequency (-7 = Not Applicable, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.prefix as prefix_value, 
	d.label as prefix_description, 
	count(p.id) as n
from person p left outer join
	xsd_enumeration_definition d on p.prefix = d.value
where d.type_name = 'name_prefix_cl1'
group by prefix;
-- ISSUE (reported): all prefixes are "Not Applicable"
-- ISSUE t1: all prefixes are "Not Applicable"


-- FIRST_NAME -----------------------------------------------------------------------
-- ISSUE: should quality checks only focus on names of persons listed in participant table?

-- first_name frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select first_name, count(*) n 
from person 
group by first_name 
order by first_name;
-- ISSUES (reported): firstnames that are null (n=3900), '-3' (n=22), '26' (n=1), '30' (n=1)
-- ISSUES t1: firstnames that are null (n=3904), '-3' (n=31)


-- first_name is null
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_id, first_name, count(*) n
from person 
where first_name is null or first_name = ''
group by person_id, first_name;


-- if first_name is null, what is person's middle and lastname
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select first_name, middle_name, last_name, count(*) n
from person 
where first_name is null or first_name = ''
group by first_name, middle_name, last_name;
-- ISSUE: of 3900 null first names, most do not have a middle or last name (n=3896), some have not middle or last name (n=3)
-- ISSUE: of 3904 null first names, most do not have a middle or last name (n=3898), some have not middle or last name (n=5)


-- first name has odd non-alpha characters (excludes single quote, hyphen, space)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.first_name, count(*) n
from
   (
		select id, first_name
		from person
		where first_name not REGEXP "^[A-Za-z\\'\\ \\-]+$" 
   ) p
group by p.first_name;
-- ISSUE (reported): first name has parenthesis, period, comma, slash, and number (n=61)
-- ISSUE t1 (reported): first name has parenthesis, period, comma, slash, and number (n=57)


-- first name contains a period (suggesting person has middle name) yet person also has middle
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select id, first_name,  middle_name
from person
where  first_name REGEXP '[.]' and middle_name != -7;


-- LAST_NAME ------------------------------------------------------------------------


-- last_name frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select last_name, count(*) n 
from person 
group by last_name;

-- last name is null
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select count(*)
from person 
where last_name is null or last_name = '';
-- ISSUE (reported): 3 last names that are null
-- ISSUE t1: 365 last names that are null


-- odd last names (excludes single quote, space and hypen)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.last_name, count(*) n
from
   (
		select person_id, last_name
		from person
		where last_name not REGEXP "^[A-Za-z\\'\\ \\-]+$" 
   ) p
group by p.last_name;
-- ISSUE t0: last_name that is (24) = 1, (44) = 1, -3 = 66, -7 = 1050, '.' = 21, '?' = 1, and more
-- ISSUE t1: last_name that is -3=40, -7=488, and more


-- MIDDLE NAME ----------------------------------------------------------------------


-- middle_name frequency (-7 = 'not applicable')
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select middle_name, count(*) n 
from person 
group by middle_name;


-- middle name is null (-7 = 'not applicable')
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select count(*) n 
from person 
where middle_name is null or middle_name = '';
-- ISSUE t1: number of null middle names increted from 148 to 8947.


-- middle names that have odd non-alpha characters (excludes single quote, hyphen, space, period) (-7 = 'not applicable')
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.middle_name, count(*) n
from
   (
		select id, middle_name
		from person
		where middle_name not REGEXP "^[A-Za-z\\'\\ \\-\\.]+$" and middle_name != -7
   ) p
group by p.middle_name;
-- ISSUE: middle_name is -2=2, -3=27
-- ISSUE t1: middle_name is -2=2, -3=43


-- MAIDEN NAME ----------------------------------------------------------------------


-- maiden_name frequency (-7 = 'not applicable')
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select 
    case 
        when maiden_name = -7 then 'not applicable' 
        else maiden_name 
    end as maiden_name, count(*) n 
from person 
group by maiden_name;


-- maiden_name is null (-7 = 'not applicable')
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select maiden_name, count(*) n 
from person 
where maiden_name is null or maiden_name = '';


-- SUFFIX ---------------------------------------------------------------------------


-- suffix code list (-7 = Not Applicable, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'name_suffix_cl1'
order by value;


-- suffix frequency (-7 = Not Applicable, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select suffix as suffix_value,
	d.label as suffix_description, 
   	count(*) n
from person p left outer join
   xsd_enumeration_definition d on p.suffix = d.value
where d.type_name = 'name_suffix_cl1'
group by suffix;


-- TITLE ----------------------------------------------------------------------------


-- title frequency (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select title as title_code,
	case when title = -7 then 'Not Applicable' else title end as title_description,
	count(*) n
from person
group by title;


-- SEX ------------------------------------------------------------------------------


-- sex code list (-6 = Unknown, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'gender_cl1'
order by value;


-- sex frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.sex as sex_value, 
    d.label as sex_description, 
    count(*) n
from person p left outer join
   xsd_enumeration_definition d on p.sex = d.value
where d.type_name = 'gender_cl1'
group by p.sex, d.label;

-- participant p_type whose gender is UNKNOWN 
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

help;

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
                where d.type_name = 'participant_type_cl1'
            ) par on l.p_id = par.p_id 
        where p.sex = -6
    ) a
group by a.p_type_value, a.p_type_description;
-- ISSUE (reported): comparing participant.p_type with person.sex, is it possible that gender is UNKNOWN for:
    -- 'Pregnant eligible women' (n=24)
    -- 'High-Trier-eligible for Pre_pregnancy Visit' (n=3)
    -- 'Age-eligible woman, ineligible for pre-pregnancy visit - being followed' (n=3)


-- AGE ------------------------------------------------------------------------------


-- age frequency (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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
order by a.age;


-- p_type of participant who has 0 (zero) age
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select a.p_type_value, a.p_type_description, a.p_type_oth, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, 
            par.p_type_oth,
            p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' 
            and p.age = 0
    ) a
group by a.p_type_value, a.p_type_description, a.p_type_oth;


-- p_type of participant who REFUSED age 
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select a.p_type_value, a.p_type_description, a.p_type_oth, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, 
            par.p_type_oth, 
            p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' and p.age = -1
    ) a
group by a.p_type_value, a.p_type_description, a.p_type_oth;
-- ISSUE: the following participant p_type refused age
    -- Other
    -- Missing in Error
    -- Age-eligible women, ineligible for pre-pregnancy visit - being followed
    -- High_Trier - eligible for Pre-Pregnancy Visit


-- p_type of participant whose age is UNKNOWN 
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select a.p_type_value, a.p_type_description, a.p_type_oth, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, 
            par.p_type_oth,
            p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' and p.age = -6
    ) a
group by a.p_type_value, a.p_type_description, a.p_type_oth;


-- p_type of participant whose age is MISSING IN ERROR 
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select a.p_type_value, a.p_type_description, a.p_type_oth, count(*) n
from
    (
        select p.person_id, 
            par.p_id, 
            par.p_type as p_type_value, 
            d.label as p_type_description, 
            par.p_type_oth,
            p.age
        from person p inner join
            link_person_participant l on p.person_id = l.person_id inner join
            participant par on l.p_id = par.p_id left outer join
            xsd_enumeration_definition d on par.p_type = d.value
        where d.type_name = 'participant_type_cl1' and p.age = -4
    ) a
group by a.p_type_value, a.p_type_description, a.p_type_oth;


-- AGE RANGE ------------------------------------------------------------------------


-- age_range code list (-6 = Unknow, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select * 
from xsd_enumeration_definition 
where type_name = 'age_range_cl1'
order by value;


-- age_range frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.age_range as age_range_value, 
    d.label as age_range_description, 
    p.n
from
   (
       select age_range, count(*) n
       from person
       group by age_range
       order by age_range
   ) p left outer join
   xsd_enumeration_definition d on p.age_range = d.value
where d.type_name = 'age_range_cl1'
order by p.age_range ;


-- TODO: does age range corroborate with person's dob?


-- PERSON_DOB -----------------------------------------------------------------------

-- person_dob (-1 = Refused, -6 Unknown) frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_dob, count(*) n
from person
group by person_dob;


-- TODO: COMPARE AGE, AGE_RAGE AND PERSON_DOB ----------------------------------------


-- DECEASED -------------------------------------------------------------------------


-- deceased code list (-4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition
where type_name = 'confirm_type_cl2'
order by value;


-- deceased frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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
where d.type_name = 'confirm_type_cl2';


-- TODO: of those deceased and UNKNOWN deceased, how many are participants.


-- ETHNIC GROUP ---------------------------------------------------------------------


-- ethnic_group code list (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select * 
from xsd_enumeration_definition 
where type_name = 'ethnicity_cl1'
order by value;


-- ethnic_group frequency (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.ethnic_group as ethnic_group_value,
   d.label as ethnic_group_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.ethnic_group = d.value
where d.type_name = 'ethnicity_cl1'
group by p.ethnic_group;
-- ISSUE (reported): is 66% (6270/9515) UNKNOWN acceptable for ethnic group


-- PERSON_LANG & PERSON_LANG_OTH ----------------------------------------------------


-- person_lang code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;

-- person_lang frequency 
    -- person_lang (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
    -- person_lang_oth (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.person_lang as person_lang_value,
   d.label as person_lang_description,
    p.person_lang_oth, 
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.person_lang = d.value
where d.type_name = 'language_cl2'
group by p.person_lang, p.person_lang_oth;
-- ISSUE (reported): what is person_lang_oth = -2


-- MARISTAT & MARISTAT_OTH ----------------------------------------------------------


-- maristat code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'marital_status_cl1'
order by value;


-- maristat frequency
    -- maristat (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
    -- maristat_oth (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.maristat as maristat_value,
   d.label as maristat_description,
    p.maristat_oth, 
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.maristat = d.value
where type_name = 'marital_status_cl1'
group by p.maristat, maristat_oth
order by p.maristat;


-- PREF_CONTACT & PREF_CONTACT_OTH --------------------------------------------------


-- pref_contact code list (-5 = Other, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'contact_type_cl1'
order by value;


-- pref_contact frequency
    -- pref_contact (-5 = Other, -4 = Missing in Error)
    -- pref_contact_oth (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.pref_contact as pref_contact_value,
   d.label as pref_contact_description,
    p.pref_contact_oth,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.pref_contact = d.value
where d.type_name = 'contact_type_cl1'
group by p.pref_contact, p.pref_contact_oth;


-- PLAN_MOVE, MOVE_INFO, NEW_ADDRESS_ID, WHEN_MOVE ----------------------------------


-- plan_move code list (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl1'
order by value;


-- plan_move frequncy (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.plan_move as plan_move_value,
   d.label as plan_move_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.plan_move = d.value
where d.type_name = 'confirm_type_cl1'
group by p.plan_move;


-- move_info code list (-7 = Not Applicable, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'moving_plan_cl1'
order by value;


-- move_info frequncy (-7 = Not Applicable, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.move_info as move_info_value,
   d.label as move_info_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.move_info = d.value
where d.type_name = 'moving_plan_cl1'
group by p.move_info;


-- new_address_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select new_address_id, count(*) n
from person
group by new_address_id;
-- ISSUE (reported): what is a new_address_id of -3 (n=3512) and -7 (n=5975)


-- when_move code list (-7 = Not Applicable, -6 = Unknown, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl4'
order by value;


-- when_move frequency (-7 = Not Applicable, -6 = Unknown, -4 = Missing in Error, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.when_move as when_move_value,
   d.label as when_move_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.when_move = d.value
where d.type_name = 'confirm_type_cl4'
group by p.when_move;


-- date_move (-7 = Not Applicable, -6 = Unknown, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select date_move, count(*) n
from person
group by date_move
order by date_move;


-- date_move oddity (-7 = Not Applicable, -6 = Unknown, -1 = Refused)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select date_move, count(*) n
from person
where (date_move REGEXP '^9' or date_move REGEXP '-9+');


-- TODO: does plan_move, move_info, new_address_id, when_move & date_move corroberate?


-- P_TRACING, P_INFO_SOURCE, P_INFO_SOURCE_OTH, P_INFO_DATE, P_INFO_UPDATE ----------

-- p_tracing code list (-4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- p_tracing frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.p_tracing as p_tracing_value,
   d.label as p_tracing_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.p_tracing = d.value
where d.type_name = 'confirm_type_cl2'
group by p.p_tracing;


-- p_info_source code list (-5 = Other, -4 = Missing in Error)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl4'
order by value;


-- p_info_source combined list frequency
    -- p_info_source (-5 = Other, -4 = Missing in Error)
    -- p_info_source_oth (-7 = Not Applicable)
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p.p_info_source as p_p_info_source_value,
    d.label as p_info_source_description,
    p.p_info_source_oth, 
    count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.p_info_source = d.value
where d.type_name = 'information_source_cl4'
group by p.p_info_source, p.p_info_source_oth;


-- p_info_date frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p_info_date as p_info_date_value, count(*) n
from person
where (p_info_date REGEXP '^9' or p_info_date REGEXP '-9+')
order by p_info_date;


-- p_info_date oddity
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p_info_date, count(*) n
from person
where (p_info_date REGEXP '^9' or p_info_date REGEXP '-9+')
group by p_info_date
order by p_info_date;
-- ISSUE (reported): what is p_info_date of 9777-97-97 mean?


-- p_info_update frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p_info_update as p_info_update_value, count(*) n
from person
group by p_info_update
order by p_info_update;


-- p_info_update oddity
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select p_info_update as p_info_update_value, count(*) n
from person
where (p_info_update REGEXP '^9' or p_info_update REGEXP '-9+')
order by p_info_update;
-- ISSUE (reported): what is p_info_update of 9777-97-97 mean?


-- person_comment
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select person_comment, count(*) n
from person
group by person_comment;


-- transaction_type
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

select transaction_type, count(*) n
from person
group by transaction_type;


/*************************************************************************************
 * table: person_race
 *************************************************************************************/

show columns from person_race;
select count(*) n from person_race;
select * from person_race;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) n
from person_race
group by psu_id
order by count(*) desc;


-- PERSON_RACE_ID -------------------------------------------------------------------


-- person_race_id is not unique
select *
from
    (
        select person_race_id, count(*) n
        from person_race
        group by person_race_id
        order by count(*) desc
    ) pr
where pr.n > 1;


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) n
from person_race
group by person_id
order by count(*) desc;

select *
from person_race
where person_id = '60289801';


-- person_id is not unique
select *
from
    (
        select person_id, count(*) n
        from person_race
        group by person_id
        order by count(*) desc
    ) pr
where pr.n > 1;


-- RACE & RACE_OTH ------------------------------------------------------------------

-- race code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'race_cl1'
order by value;


-- race frequency
    -- race (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
    -- race_oth (-7 = Not Applicable)
select r.race as race_value,
    d.label as race_description,
    r.race_oth, 
    count(r.id) as n
from person_race r left outer join
   xsd_enumeration_definition d on r.race = d.value
where d.type_name = 'race_cl1'
group by r.race, r.race_oth;


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
where d.type_name = 'confirm_type_cl2'
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
    l.hh_rank_oth, 
    count(l.id) as n
from link_person_household l left outer join
   xsd_enumeration_definition d on l.hh_rank = d.value
where d.type_name = 'communication_rank_cl1'
group by l.hh_rank, l.hh_rank_oth
order by l.hh_rank;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from link_person_household
group by transaction_type;


/*************************************************************************************
 * table: address
 *************************************************************************************/

Use ncs_mdes_prod;
Use ncs_mdes_6_04;

show columns from address;

Use ncs_mdes_prod;
Use ncs_mdes_6_04;
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
where d.type_name = 'psu_cl1'
group by a.psu_id;

-- psu_id  is not correct
select * from address where psu_id != 20000048;


-- ADDRESS_ID -----------------------------------------------------------------------

-- address_id frequency
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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
-- ISSUE (reported): is it possible for an address_id not linked to a person_id (30,752 have a null person_id)?

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
-- ISSUE (reported): what does provider_id of -3 and -7?


-- TODO: link provider_id to external table


-- DU_ID ----------------------------------------------------------------------------

select du_id, count(*) n 
from address 
group by du_id 
order by count(*) desc;
-- ISSUE (reported): what does a du_id of -7 (n=3900) mean?


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
    a.address_rank_oth, 
    count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_rank = d.value
where d.type_name = 'communication_rank_cl1'
group by a.address_rank, a.address_rank_oth
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
    a.address_info_source_oth,
    count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_info_source = d.value
where d.type_name = 'information_source_cl1'
group by a.address_info_source, a.address_info_source_oth;


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
    a.address_info_mode_oth, 
    count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_info_mode = d.value
where d.type_name = 'contact_type_cl1'
group by a.address_info_mode, a.address_info_mode_oth;


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
-- ISSUE (reported): what is an address_info_date of 92 (n=1) and 97 (n=2) mean?


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
-- ISSUE (reported): what is an address_info_update of 92 and 97 mean?


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
    a.address_type_oth, 
    count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_type = d.value
where d.type_name = 'address_category_cl1'
group by a.address_type, a.address_type_oth;


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
    a.address_description_oth, 
    count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_description = d.value
where d.type_name = 'residence_type_cl1'
group by a.address_description, a.address_description_oth;


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
-- ISSUE (reported): what does an address_2 of -7 (n=3584) and 8 (n=1) mean?


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
-- ISSUE (reported): what does a unit of -3 (n=164) and -2 (n=1)


-- city frequency
select city, count(*) n
from address
group by city
order by city;
-- ISSUE (reported): what does city of -2 (n=11), -3 (n=5) and -7 (n=12)


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
where d.type_name = 'state_cl1'
group by a.state
order by a.state;


-- zip
select zip, count(*) n
from address
group by zip
order by zip;
-- ISSUE (reported): what is a zip of -1 (n=8), -2 (n=115), and -3 (n=7)?


-- zip4
select zip4, count(*) n
from address
group by zip4
order by zip4;
-- ISSUE (reported): what is a zip4 of -1 (n=33), -2 (n=31), -3 (n=2) and -7 (n=457)


-- ADDRESS_COMMENT --------------------------------------------------------------------------
select address_comment, count(*) n
from address
group by address_comment
order by count(*) desc;
-- ISSUE (reported): what is an address_comment of -3 (n=2) mean?


-- TRANSACTION TYPE -------------------------------------------------------------------------
select transaction_type, count(*) n
from address
group by transaction_type;


/*************************************************************************************
 * table: email
 *************************************************************************************/

show columns from email;

Use ncs_mdes_prod;
Use ncs_mdes_6_04;
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
where d.type_name = 'psu_cl1'
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
    e.email_rank_oth,
    count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_rank = d.value
where d.type_name = 'communication_rank_cl1'
group by e.email_rank, e.email_rank_oth;


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
    e.email_info_source_oth, 
    count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_info_source = d.value
where d.type_name = 'information_source_cl1'
group by e.email_info_source, e.email_info_source_oth;


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
-- ISSUE (reported): what is does email_info_date of 92 (n=2) mean?


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
-- ISSUE (reported): what is does email_info_update of 97 (n=2631) mean?


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
    e.email_type_oth, 
    count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_type = d.value
where d.type_name = 'email_type_cl1'
group by e.email_type, e.email_type_oth;


-- EMAIL_SHARE ----------------------------------------------------------------------

select e.email_share as email_share_value,
   d.label as email_share_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_share = d.value
where d.type_name = 'confirm_type_cl1'
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
where d.type_name = 'confirm_type_cl2'
group by e.email_active;


-- TODO: does email_active correlate with email_rank, particulary for someone who has several different email addresses.


-- EMAIL_COMMENT --------------------------------------------------------------------
select email_comment, count(*) n
from email
group by email_comment;
-- ISSUE (reported): what does a comment of -7 mean, and how does that differ from NA?


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
select * from telephone;


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
where d.type_name = 'psu_cl1'
group by t.psu_id;


-- PHONE_ID -----------------------------------------------------------------------


-- phone_id frequency
select phone_id, count(*) n 
from telephone 
group by phone_id 
order by count(*) desc;


-- phone_id is not unique
select *
from
    (
        select phone_id, count(*) n 
        from telephone 
        group by phone_id     
    ) t
where t.n > 1;


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) n 
from telephone 
group by person_id 
order by count(*) desc;


-- INSTITUTE_ID ---------------------------------------------------------------------


-- institute_id frequency
select institute_id, count(*) n 
from telephone 
group by institute_id 
order by count(*) desc;


-- PROVIDER_ID ---------------------------------------------------------------------


-- provider_id frequency
select provider_id, count(*) n 
from telephone 
group by provider_id 
order by count(*) desc;


-- PHONE_INFO_SOURCE & PHONE_INFO_SOURCE_OTH ---------------------------------------


-- phone_info_source code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl1'
order by value;


-- phone_info_source combine list frequency
    -- phone_info_source (-5 = Other, -4 = Missing in Error)
    -- phone_info_source_oth (-7 = Not Applicable)
select t.phone_info_source as phone_info_source_value,
    d.label as phone_info_source_description,
    t.phone_info_source_oth, 
    count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_info_source = d.value
where d.type_name = 'information_source_cl1'
group by t.phone_info_source, t.phone_info_source_oth;


-- PHONE_INFO_DATE & PHONE_INFO_UPDATE ----------------------------------------------


-- phone_info_date frequency
select phone_info_date, count(*) n
from telephone
group by phone_info_date
order by phone_info_date;


-- phone_info_date oddity
select phone_info_date, count(*) n
from telephone
where (phone_info_date REGEXP '^9' or phone_info_date REGEXP '-9+');
-- ISSUE (reported): what is a phone_info_date of 9222-92-92?


-- phone_info_update frequency
select phone_info_update, count(*) n
from telephone
group by phone_info_update
order by phone_info_update;


-- phone_info_update oddity
select phone_info_update, count(*) n
from telephone
where (phone_info_update REGEXP '^9' or phone_info_update REGEXP '-9+');
-- ISSUE (reported): what is a phone_info_update of 9777-97-97?


-- PHONE_NBR & PHONE_EXT ------------------------------------------------------------


-- phone_nbr frequency
select phone_nbr, count(*) n
from telephone
group by phone_nbr
order by count(*) desc;


-- phone_nbr is null
select *
from telephone
where phone_nbr is null or phone_nbr = '';


-- phone_ext frequency
select phone_ext, count(*) n
from telephone
group by phone_ext
order by count(*) desc;


-- PHONE_TYPE & PHONE_TYPE_OTH --------------------------------------------------


-- phone_type code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'phone_type_cl1'
order by value;


-- phone_type frequency
    -- phone_type (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
    -- phone_type_oth (-7 = Not Applicable)
select t.phone_type as phone_type_value,
    d.label as phone_type_description,
    t.phone_type_oth, 
    count(t.id) as n
from telephone t left outer join
    xsd_enumeration_definition d on t.phone_type = d.value
where d.type_name = 'phone_type_cl1'
group by t.phone_type, t.phone_type_oth;


-- PHONE_RANK & PHONE_RANK_OTH --------------------------------------------------


-- phone_rank code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'communication_rank_cl1'
order by value;


-- phone_rank frequency
    -- phone_rank (-5 = Other, -4 = Missing in Error)
    -- phone_rank_oth (-7 = Not Applicable)
select t.phone_rank as phone_rank_value,
   d.label as phone_rank_description,
    t.phone_rank_oth, 
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_rank = d.value
where d.type_name = 'communication_rank_cl1'
group by t.phone_rank, t.phone_rank_oth;


-- PHONE_LANDLINE ---------------------------------------------------------------


-- phone_landline code list (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl1'
order by value;


-- phone_landline (-6 = Unknown, -4 = Missing in Error, -1 = Refused)
select t.phone_landline as phone_landline_value,
   d.label as phone_landline_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_landline = d.value
where d.type_name = 'confirm_type_cl1'
group by t.phone_landline;


-- PHONE_SHARE ------------------------------------------------------------------


-- phone_share code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- phone_share code frequency
select t.phone_share as phone_share_value,
   d.label as phone_share_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.phone_share = d.value
where d.type_name = 'confirm_type_cl2'
group by t.phone_share;


-- CELL_PERMISSION --------------------------------------------------------------


-- cell_permission code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- cell_permission frequency (-4 = Missing in Error)
select t.cell_permission as cell_permission_value,
   d.label as cell_permission_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.cell_permission = d.value
where d.type_name = 'confirm_type_cl2'
group by t.cell_permission;


-- TEXT_PERMISSION --------------------------------------------------------------


-- text_permission code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- text_permission frequency (-4 = Missing in Error)
select t.text_permission as text_permission_value,
   d.label as text_permission_description,
   count(t.id) as n
from telephone t left outer join
   xsd_enumeration_definition d on t.text_permission = d.value
where d.type_name = 'confirm_type_cl2'
group by t.text_permission;


-- PHONE_COMMENT ----------------------------------------------------------------


-- phone_comment frequency
select phone_comment,
   count(*) as n
from telephone 
group by phone_comment;


-- PHONE_START_DATE & PHONE_START_DATE ------------------------------------------


-- phone_start_date (6 = Unknown, 4 = Missing in Error)
select phone_start_date,
   count(*) as n
from telephone 
group by phone_start_date;


-- phone_end_date (6 = Unknown)
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
where d.type_name = 'psu_cl1'
group by p.psu_id;


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
where d.type_name = 'participant_status_cl1'
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
where d.type_name = 'ppg_status_cl1'
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
-- ISSUE (reported): what does orig_due_date containing 92 and 97 mean?


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
-- ISSUE (reported): what does a due_date_2 of 97 mean?


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
-- ISSUE (reported): what does a due_date_3 of 97 mean?


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
where d.type_name = 'psu_cl1'
group by p.psu_id;


-- PPG_HISTORY_ID -------------------------------------------------------------------


-- ppg_history_id frequency
select ppg_history_id, count(*) n 
from ppg_status_history
group by ppg_history_id 
order by count(*) desc;
-- ISSUE (reported): the value of ppg_history_id comprise of p_id + ? + ppg_status_date.  What is the middle data?


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
where d.type_name = 'ppg_status_cl1'
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
where d.type_name = 'information_source_cl3'
group by p.ppg_info_source, ppg_info_source_oth;


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
where d.type_name = 'contact_type_cl1'
group by p.ppg_info_mode, ppg_info_mode_oth;


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

Use ncs_mdes_prod;
Use ncs_mdes_6_04;
 
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
where d.type_name = 'psu_cl1'
group by x.psu_id;

-- psu_id  is not correct
select * from ppg_status_history where psu_id != 20000048;


-- CONTACT_ID -----------------------------------------------------------------------


-- contact_id frequency
select contact_id, count(*) n
from link_contact 
group by contact_id 
order by count(*) desc;
-- ISSUE (reported): what is the contact_id convention because some are 7-digits long 
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
-- ISSUE: what does a contact_link_id link to?

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
-- ISSUE (reported): 164,132 with person_id of -7


-- PRIVIDER_ID ----------------------------------------------------------------------
select provider_id, count(*) n
from link_contact 
group by provider_id 
order by count(*);
-- ISSUE (reported): provider_id is either: null OR -7.  Is that correct?


-- TRANSACTION_TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from link_contact
group by transaction_type;


/*************************************************************************************
 * table: contact
 *************************************************************************************/
select count(*) n from ncs_mdes_prod.contact;
select count(*) n from ncs_mdes_6_04.contact;
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

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
where d.type_name = 'psu_cl1'
group by x.psu_id;

-- psu_id  is not correct
select * from link_contact where psu_id != 20000048;


-- CONTACT_ID -----------------------------------------------------------------------


-- contact_id frequency
select contact_id, count(*) n
from contact 
group by contact_id 
order by contact_id;
-- ISSUE (reported): contact_id of -3 and -7
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
-- ISSUE: where is "Value from Disposition Codes on Event Disp Codes worksheet of this document" (code list)


-- CONTACT_TYPE & CONTACT_TYPE_OTH --------------------------------------------------


-- contact_type

select x.contact_type as contact_type_value,
   d.label as contact_type_description,
   count(x.id) as n
from contact x left outer join
   xsd_enumeration_definition d on x.contact_type = d.value
where d.type_name = 'contact_type_cl1'
group by x.contact_type;
-- ISSUE (reported): should any of the contact_type be "Missing in Error" (n=2)?


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
-- ISSUE (reported): what is contact_type_oth of -4 (n=153)?


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
where d.type_name = 'language_cl2'
group by x.contact_lang;
-- ISSUE: contact_lang of "Missing in Error" (n=165,848) seems large.


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
where d.type_name = 'translation_method_cl3'
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
where d.type_name = 'contact_location_cl1'
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
where d.type_name = 'confirm_type_cl2'
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
-- ISSUE (reported): what is contact_distance of -4.00 (n=171,014) mean?


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
where d.type_name = 'contacted_person_cl1'
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
where d.type_name = 'psu_cl1'
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
-- ISSUE (reported): is it possible to have an event_id with no participant_id (n=27,242)?


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
-- ISSUE (reported): what does event_start_date of 96 and 92 mean?


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
-- ISSUE (reported): what does event_start_time of 96 mean?


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
-- ISSUE (reported): what does event_end_date of 92 (n=2), 96 (n=44), and 97 (n=23,164) mean?


-- event_end_time frequency
select event_end_time, count(*)
from event
group by event_end_time
order by event_end_time;
-- ISSUE (reported): there's an event_end_time of 00:22. Does that make sense?


-- odd event_end_time
select event_end_time, count(*) n
from event
where (event_end_time REGEXP '^9' or event_end_time REGEXP ':9+')
group by event_end_time;
-- ISSUE (reported): what does event_end_time of 96:96 (n=172) and 97:97 (n=23,167) mean?


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
where d.type_name = 'confirm_type_cl1'
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
where d.type_name = 'psu_cl1'
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
where d.type_name = 'instrument_type_cl1'
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
where ins_date_start is null or ins_date_start = ''
	or ins_start_time is null or ins_start_time = '';


-- INS_DATE_END & INS_END_TIME ------------------------------------------------------


-- missing ins_date_end or ins_end_time
select id, ins_date_end, ins_end_time
from instrument
where ins_date_end is null or ins_date_end = ''
	or ins_end_time is null or ins_end_time = '';


-- INS_BREAKOFF ---------------------------------------------------------------------


-- ins_breakoff code list
select * from xsd_enumeration_definition where type_name = 'confirm_type_cl2';


-- ins_breakoff frequency
select x.ins_breakoff as ins_breakoff_value,
   d.label as ins_breakoff_description,
   count(x.id) as n
from instrument x left outer join
   xsd_enumeration_definition d on x.ins_breakoff = d.value
where d.type_name = 'confirm_type_cl2'
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
where d.type_name = 'instrument_status_cl1'
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
where d.type_name = 'instrument_admin_mode_cl1'
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
where d.type_name = 'instrument_admin_method_cl1'
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
where d.type_name = 'confirm_type_cl2'
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
where d.type_name = 'confirm_type_cl2'
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
where d.type_name = 'psu_cl1'
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
-- ISSUE (reported): why are there 173 null du_id?


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
where d.type_name = 'du_vacancy_info_source_cl1'
group by x.nir_vac_info;


-- NIR_NOACCESS & NIR_NOACCESS_OTH --------------------------------------------------


-- nir_noaccess code list (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'no_access_descr_cl1'
order by value;


-- nir_noaccess combine list frequency
    -- nir_noaccess (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
    -- nir_noaccess_oth
select x.nir_noaccess as nir_noaccess_value,
    d.label as nir_noaccess_description,
    x.nir_noaccess_oth,
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_noaccess = d.value
where d.type_name = 'no_access_descr_cl1'
group by x.nir_noaccess, x.nir_noaccess_oth;


-- NIR_ACCESS_ATTEMPT & NIR_ACCESS_ATTEMPT_OTH --------------------------------------


-- nir_access_attempt code list (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'access_attempt_cl1'
order by value;


-- nir_access_attempt frequency
    -- nir_access_attempt (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
    -- nir_access_attempt_oth 
select x.nir_access_attempt as nir_access_attempt_value,
    d.label as nir_access_attempt_description,
    x.nir_access_attempt_oth,
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_access_attempt = d.value
where d.type_name = 'access_attempt_cl1'
group by x.nir_access_attempt, x.nir_access_attempt_oth;
-- ISSUE (reported): what is a nir_access_attempt_oth of -7?  This is not mentioned in the Master Data Element Spedification document.


-- TODO: does nir_noaccess and nir_noaccess_oth correlate with nir_access_attempt and nir_access_attempt_oth?


-- NIR_TYPE_PERSON & NIR_TYPE_PERSON_OTH --------------------------------------------


-- nir_type_person code list (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'nir_reason_person_cl1'
order by value;


-- nir_type_person combine list frequency
    -- nir_type_person (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
    -- nir_type_person_oth 
select x.nir_type_person as nir_type_person_value,
    d.label as nir_type_person_description,
    x.nir_type_person_oth, 
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_type_person = d.value
where d.type_name = 'nir_reason_person_cl1'
group by x.nir_type_person, x.nir_type_person_oth;
-- ISSUE (reported): what is a nir_type_person_oth of -7?


-- COG_INFORM_RELATION & COG_INFORM_RELATION_OTH ------------------------------------


-- cog_inform_relation code list (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'nir_inform_relation_cl1'
order by value;


-- cog_inform_relation combine list frequency
    -- cog_inform_relation (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
    -- cog_inform_relation_oth (-1 = Refused, -2 = Don't Know, -3 = Legitimate)
select x.cog_inform_relation as cog_inform_relation_value,
    d.label as cog_inform_relation_description,
    x.cog_inform_relation_oth,
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.cog_inform_relation = d.value
where d.type_name = 'nir_inform_relation_cl1'
group by x.cog_inform_relation, x.cog_inform_relation_oth;
-- ISSUE (reported): what is a cog_inform_relation_oth of -7?


-- COG_DIS_DESC & PERM_DISABILITY ---------------------------------------------------


-- cog_dis_desc frequency
select cog_dis_desc, count(*) n
from non_interview_rpt 
group by cog_dis_desc;
-- ISSUE (reported): what is a cog_dis_desc of -7?


-- perm_disability code list (-7 = Not applicable, -6 = Unknown, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl10'
order by value;


-- perm_disability frequency (-7 = Not applicable, -6 = Unknown, -4 = Missing in Error)
select x.perm_disability as perm_disability_value,
   d.label as perm_disability_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.perm_disability = d.value
where d.type_name = 'confirm_type_cl10'
group by x.perm_disability;


-- DECEASED_INFORM_RELATION & DECEASED_INFORM_OTH -----------------------------------


-- deceased_inform_relation code list (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'nir_inform_relation_cl1'
order by value;


-- deceased_inform_relation frequency
    -- deceased_inform_relation (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
    -- deceased_inform_oth
select x.deceased_inform_relation as deceased_inform_relation_value,
    d.label as deceased_inform_relation_description,
    x.deceased_inform_oth, 
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.deceased_inform_relation = d.value
where d.type_name = 'nir_inform_relation_cl1'
group by x.deceased_inform_relation, x.deceased_inform_oth;


-- YOD & STATE_DEATH ----------------------------------------------------------------


-- yod frequency
select yod, count(*) n
from non_interview_rpt 
group by yod;
-- ISSUE (reported): what is a yod of 9777?


-- state_death frequency (-7 = Not Applicable, -6 = Unknown, -4 = Missing in Error)
select state_death, count(*) n
from non_interview_rpt 
group by state_death;


-- WHO_REFUSED & WHO_REFUSED_OTH ----------------------------------------------------


-- who_refused code list (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'nir_inform_relation_cl1'
order by value;


-- who_refused frequency
    -- who_refused (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
    -- who_refused_oth 
select x.who_refused as who_refused_value,
    d.label as who_refused_description,
    x.who_refused_oth, 
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.who_refused = d.value
where d.type_name = 'nir_inform_relation_cl1'
group by x.who_refused, x.who_refused_oth;
-- ISSUE (reported): what is a who_refused_oth of 9777?


-- REFUSER_STRENGTH -----------------------------------------------------------------


-- refuser_strength code list (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'refusal_intensity_cl1'
order by value;


-- refuser_strength frequency (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
select x.refuser_strength as refuser_strength_value,
   d.label as refuser_strength_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.refuser_strength = d.value
where d.type_name = 'refusal_intensity_cl1'
group by x.refuser_strength;


-- REF_ACTION -----------------------------------------------------------------------


-- ref_action code list (-7 = Not Applicable, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'refusal_action_cl1'
order by value;


-- ref_action frequency (-7 = Not Applicable, -4 = Missing in Error)
select x.ref_action as ref_action_value,
   d.label as ref_action_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.ref_action = d.value
where d.type_name = 'refusal_action_cl1'
group by x.ref_action;


-- LT_ILLNESS_DESC ------------------------------------------------------------------


-- lt_illness_desc frequency
select lt_illness_desc, count(*) n
from non_interview_rpt 
group by lt_illness_desc;
-- ISSUE (reported): what is a lt_illness_desc of -7?


-- PERM_LTR -------------------------------------------------------------------------


-- perm_ltr code list (-7 = Not Applicable, -6 = Unknown, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl10'
order by value;


-- perm_ltr frequency (-7 = Not Applicable, -6 = Unknown, -4 = Missing in Error)
select x.perm_ltr as perm_ltr_value,
   d.label as perm_ltr_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.perm_ltr = d.value
where d.type_name = 'confirm_type_cl10'
group by x.perm_ltr;


-- REASON_UNAVAIL & REASON_UNAVAIL_OTH ----------------------------------------------


-- reason_unavail code list (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'unavailable_reason_cl1'
order by value;


-- reason_unavail combine list frequency 
    -- reason_unavail (-7 = Not Applicable, -6 = Unknown, -5 = Other, -4 = Missing in Error)
    -- reason_unavail_oth 
select x.reason_unavail as reason_unavail_value,
    d.label as reason_unavail_description,
    x.reason_unavail_oth,
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.reason_unavail = d.value
where d.type_name = 'unavailable_reason_cl1'
group by x.reason_unavail, x.reason_unavail_oth;
-- ISSUE (reported): what is a reason_unavail_oth of -7?


-- DATE_AVAILABLE -------------------------------------------------------------------


-- date_available frequency (1 = Refused, 6 = Unknown)
select date_available, count(*) n
from non_interview_rpt 
group by date_available;
-- ISSUE (reported): what is a date_available of 9777-97-97?


-- DATE_MOVED -----------------------------------------------------------------------


-- date_moved frequency (1 = Refused, 6 = Unknown)
select date_moved, count(*) n
from non_interview_rpt 
group by date_moved;
-- ISSUE (reported): what is a date_moved of 9777-97-97?


-- MOVED_LENGTH_TIME ----------------------------------------------------------------


-- moved_length_time frequency
select moved_length_time, count(*) n
from non_interview_rpt 
group by moved_length_time;
-- ISSUE: is moved_length_time  of -7.00 a code, and if so, what does it mean?


-- MOVED_UNIT -----------------------------------------------------------------------


-- moved_unit code list (-4 = Missing in Error, -3 = Legitimate Skip)
select *
from xsd_enumeration_definition 
where type_name = 'time_unit_past_cl1'
order by value;


-- moved_unit frequency (-4 = Missing in Error, -3 = Legitimate Skip)
select x.moved_unit as moved_unit_value,
    d.label as moved_unit_description,
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.moved_unit = d.value
where d.type_name = 'time_unit_past_cl1'
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
    x.moved_relation_oth, 
    count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.moved_inform_relation = d.value
where d.type_name = 'moved_inform_relation_cl1'
group by x.moved_inform_relation, x.moved_relation_oth;
-- ISSUE (reported): what is a moved_relation_oth of -7.


-- NIR_OTH --------------------------------------------------------------------------


-- nir_other frequency
select nir_other, count(*) n
from non_interview_rpt 
group by nir_other;
-- ISSUE (reported): what is nir_other of -7?


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
select * from non_interview_rpt_dutype;

-- NOTE: no data yet

 

/*************************************************************************************
 * table: non_interview_rpt_noaccess
 *************************************************************************************/


show columns from non_interview_rpt_noaccess;
select count(*) n from non_interview_rpt_noaccess;
select * from non_interview_rpt_noaccess;

-- NOTE: no data yet


 
/*************************************************************************************
 * table: non_interview_rpt_refusal
 *************************************************************************************/


show columns from non_interview_rpt_refusal;
select count(*) n from non_interview_rpt_refusal;
select * from non_interview_rpt_refusal;

-- NOTE: no data yet


 
/*************************************************************************************
 * table: non_interview_rpt_vacant
 *************************************************************************************/

show columns from non_interview_rpt_vacant;
select count(*) n from non_interview_rpt_vacant;
select * from non_interview_rpt_vacant;

-- NOTE: no data yet



/*************************************************************************************
 * table: incident
 *************************************************************************************/

show columns from incident;
select count(*) n from incident;
select * from incident;

-- NOTE: no data yet


/*************************************************************************************
 * table: incident_media
 *************************************************************************************/


show columns from incident_media;
select count(*) n from incident_media;
select * from incident_media;

-- NOTE: no data yet


/*************************************************************************************
 * table: incident_unanticipated
 *************************************************************************************/

show columns from incident_unanticipated;
select count(*) n from incident_unanticipated;
select * from incident_unanticipated;

-- NOTE: no data yet



/*************************************************************************************
 * table: participant_auth
 *************************************************************************************/

show columns from participant_auth;
select count(*) n from participant_auth;
select * from participant_auth;

-- NOTE: no data yet



/*************************************************************************************
 * table: participant_consent 
 *************************************************************************************/


show columns from participant_consent;
select count(*) n from participant_consent;
select * from participant_consent;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- PARTICIPANT_CONSENT_ID -----------------------------------------------------------


-- participant_consent_id frequency
select participant_consent_id, count(*) n
from participant_consent
group by participant_consent_id;


-- participant_consent_id is not unique
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


-- CONSENT_TYPE (for Phase 1 Concent only) ------------------------------------------


-- consent_type code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'consent_type_cl1'
order by value;


-- consent_type frequency (-4 = Missing in Error)
select x.consent_type as consent_type_value,
   d.label as consent_type_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_type = d.value
where d.type_name = 'consent_type_cl1'
group by x.consent_type
order by x.consent_type;


-- CONSENT_FORM_TYPE (for Phase 1 Concent only) -------------------------------------


-- consent_form_type code list
select *
from xsd_enumeration_definition 
where type_name = 'consent_type_cl3'
order by value;
-- ISSUE (reported): there is no 'consent_type_cl3' enumeration for participant_consent.consent_form_type.


-- consent_type frequency
select x.consent_form_type as consent_form_type_value,
   d.label as consent_form_type_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_form_type = d.value
where d.type_name = 'consent_type_cl3'
group by x.consent_form_type;


-- CONSENT_VERSION ------------------------------------------------------------------


-- consent_version frequency
select consent_version, count(*) n
from participant_consent
group by consent_version
order by consent_version;
-- ISSUE (reported): is consent_version frequency for consent_type or consent_form_type?


-- consent_type, by consent_version frequency
select consent_type, consent_version, count(*) n
from participant_consent
group by consent_type, consent_version
order by consent_type, consent_version;


-- TODO: check how well these link to consents listing


-- CONSENT_EXPIRATION ---------------------------------------------------------------


-- consent_expiration frequency
select consent_expiration, count(*) n
from participant_consent
group by consent_expiration
order by consent_expiration;


-- consent_expiration dates oddity
select consent_expiration, count(*) n
from participant_consent
where consent_expiration REGEXP '^9' or consent_expiration REGEXP '-9+'
group by consent_expiration
order by consent_expiration;
-- ISSUE (reported): what is a consent_expiration of 9666-96-96?


-- TODO: consent_type & consent_form_type, by version, by consent_expiration list


-- CONSENT_GIVEN --------------------------------------------------------------------


-- consent_given code list (-4 = Missing in Error)
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
where d.type_name = 'confirm_type_cl2'
group by x.consent_given;


-- TODO: consent_type & consent_form_type, by version, by consent_given  list


-- CONSENT_DATE ---------------------------------------------------------------------


-- consent_date oddity
select *
from participant_consent
where consent_date REGEXP '^9' or consent_date REGEXP '-9+'
order by consent_date;


-- no consent_date
select *
from participant_consent
where consent_date is null or consent_date = '';


-- CONSENT_WITHDRAW -----------------------------------------------------------------


-- consent_withdraw code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- consent_withdraw frequency (-4 = Missing in Error)
select x.consent_withdraw as consent_withdraw_value,
   d.label as consent_withdraw_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_withdraw = d.value
where d.type_name = 'confirm_type_cl2'
group by x.consent_withdraw;


-- CONSENT_WITHDRAW_TYPE ------------------------------------------------------------


-- consent_withdraw_type code list (-4 = Missing in Error, -3 = Legitimate Skip)
select *
from xsd_enumeration_definition 
where type_name = 'consent_withdraw_reason_cl1'
order by value;


-- consent_withdraw_type frequency (-4 = Missing in Error, -3 = Legitimate Skip)
select x.consent_withdraw_type as consent_withdraw_type_value,
   d.label as consent_withdraw_type_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_withdraw_type = d.value
where d.type_name = 'consent_withdraw_reason_cl1'
group by x.consent_withdraw_type;


-- CONSENT_WITHDRAW_REASON ----------------------------------------------------------


-- consent_withdraw_reason code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'consent_withdraw_reason_cl2'
order by value;


-- consent_withdraw_reason frequency (-5 = Other, -4 = Missing in Error)
select x.consent_withdraw_reason as consent_withdraw_reason_value,
   d.label as consent_withdraw_reason_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_withdraw_reason = d.value
where d.type_name = 'consent_withdraw_reason_cl2'
group by x.consent_withdraw_reason;
-- ISSUE (reported): why all are consent_withdraw_reason "Missing in Error" (-4), when the consent_withdraw_type for all are "Legitimate Skip" (-3)?


-- CONSENT_WITHDRAW_DATE ------------------------------------------------------------


-- consent_withdraw_date (7 = Not Applicable, 6 = Unknown)
select consent_withdraw_date, count(*) n
from participant_consent
group by consent_withdraw_date
order by count(*);


-- CONSENT_LANGUAGE & CONSENT_LANGUAGE_OTH ------------------------------------------


-- consent_language code list (-6 = Unknown, -5 = Other, -4 = Mising in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- consent_language frequency 
    -- consent_language (-6 = Unknown, -5 = Other, -4 = Mising in Error, -1 = Refused)
    -- consent_language_oth (-7 = Not Applicable)
select x.consent_language as consent_language_value,
    d.label as consent_language_description,
    x.consent_language_oth, 
    count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_language = d.value
where d.type_name = 'language_cl2'
group by x.consent_language, x.consent_language_oth;
-- ISSUE (reported): what is consent_language_oth of -3 (n = 50)


-- PERSON_WHO_CONSENTED_ID & WHO_CONSENTED ------------------------------------------


-- person_who_consented_id (person_id) frequency
select person_who_consented_id, count(*) n
from participant_consent
group by person_who_consented_id
order by count(*) desc;


-- person_who_consented_id is null
select *
from participant_consent
where person_who_consented_id is null or person_who_consented_id = '';


-- who_consented code list (-4 = Mising in Error)
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
where d.type_name = 'age_status_cl1'
group by x.who_consented;


-- who_consented is null
select *
from participant_consent
where who_consented is null or who_consented = '';


-- PERSON_WTHDRW_CONSENT_ID (PERSON_ID) & WHO_WTHDRW_CONSENT ----------------------


-- person_wthdrw_consent_id frequency
select person_wthdrw_consent_id, count(*) n
from participant_consent
group by person_wthdrw_consent_id
order by count(*) desc;
-- ISSUE (reported): what is person_wthdrw_consent_id of -7


-- person_wthdrw_consent_id is null
select *
from participant_consent
where person_wthdrw_consent_id is null or person_wthdrw_consent_id = '';


-- who_wthdrw_consent code list (-7 = Not Applicable, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'age_status_cl3'
order by value;


-- who_wthdrw_consent frequency
select x.who_wthdrw_consent as who_wthdrw_consent_value,
   d.label as who_wthdrw_consent_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.who_wthdrw_consent = d.value
where d.type_name = 'age_status_cl3'
group by x.who_wthdrw_consent;


-- CONSENT_TRANSLATE ----------------------------------------------------------------


-- consent_translate code list (-4 = Missing in Error)
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
where d.type_name = 'translation_method_cl1'
group by x.consent_translate;


-- CONSENT_COMMENTS -----------------------------------------------------------------


-- consent_comments frequency
select consent_comments, count(*) n
from participant_consent
group by consent_comments
order by count(*) desc;
-- ISSUE (reported): what is consent_comment = -3


-- CONTACT_ID -----------------------------------------------------------------------


-- contact_id frequency
select contact_id, count(*) n
from participant_consent
group by contact_id
order by count(*) desc;

-- contact_id is null
select contact_id, count(*) n
from participant_consent
where contact_id is null or contact_id = '';


-- consent_given but not contact_id 
select x.consent_given as consent_given_value,
    d.label as consent_given_description,
    x.contact_id, 
    count(*) n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.consent_given = d.value
where d.type_name = 'confirm_type_cl2'
    and x.consent_given = 1
    and x.contact_id is null or x.contact_id = ''
group by x.consent_given;
-- ISSUE (reported): is it possible that consent_given = 1 (Yes) yet contact_id is null?


-- RECONSIDERATION_SCRIPT_USE -------------------------------------------------------


-- reconsideration_script_use code list (-7 = Not Applicable, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl21'
order by value;


-- reconsideration_script_use frequency (-7 = Not Applicable, -4 = Missing in Error)
select x.reconsideration_script_use as reconsideration_script_use_value,
   d.label as reconsideration_script_use_description,
   count(*) as n
from participant_consent x left outer join
   xsd_enumeration_definition d on x.reconsideration_script_use = d.value
where d.type_name = 'confirm_type_cl21'
group by x.reconsideration_script_use;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 


/*************************************************************************************
 * table: participant_consent_sample
 *************************************************************************************/

show columns from participant_consent_sample;
select count(*) n from participant_consent_sample;
select * from participant_consent_sample;

-- NOTE: no data yet


/*************************************************************************************
 * table: participant_vis_consent 
 *************************************************************************************/

show columns from participant_vis_consent;
select count(*) n from participant_vis_consent;
select * from participant_vis_consent;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- PID_VISIT_CONSENT_ID -------------------------------------------------------------
-- pid_visit_consent seems to comprise of pid + <some_date> + single digit


-- pid_visit_consent_id frequency
select pid_visit_consent_id, count(*) n 
from participant_vis_consent 
group by pid_visit_consent_id 
order by count(*);


-- pid_visit_consent_id is not unique
select *
from
    (
        select pid_visit_consent_id, count(*) n 
        from participant_vis_consent 
        group by pid_visit_consent_id 
        order by count(*)
    ) pvc
where pvc.n > 1;


-- P_ID -----------------------------------------------------------------------------


-- p_id  is null
select p_id 
from participant_vis_consent 
where p_id is null or p_id  = '';


-- VIS_CONSENT_TYPE -----------------------------------------------------------------


-- vis_consent_type code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'visit_type_cl1'
order by value;


-- vis_consent_type frequency (-4 = Missing in Error)
select x.vis_consent_type as vis_consent_type_value,
   d.label as vis_consent_type_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_consent_type = d.value
where d.type_name = 'visit_type_cl1'
group by x.vis_consent_type;


-- VIS_CONSENT_RESPONSE -------------------------------------------------------------


-- vis_consent_response code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- vis_consent_response frequency (-4 = Missing in Error)
select x.vis_consent_response as vis_consent_response_value,
   d.label as vis_consent_response_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_consent_response = d.value
where d.type_name = 'confirm_type_cl2'
group by x.vis_consent_response;


-- VIS_LANGUAGE & VIS_LANGUAGE_OTH --------------------------------------------------


-- vis_language code list (-6 = Unknown, -5 = Other, -4 = Mising in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- vis_language combine list frequency 
    -- vis_language (-6 = Unknown, -5 = Other, -4 = Mising in Error, -1 = Refused)
    -- vis_language_oth (-7 = Not Applicable)
select x.vis_language as vis_language_value,
    d.label as vis_language_description,
    x.vis_language_oth as vis_language_oth_value,
    if(x.vis_language_oth = -7, 'Not Applicable', x.vis_language_oth) as vis_language_oth_description,
    count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_language = d.value
where d.type_name = 'language_cl2'
group by x.vis_language, x.vis_language_oth;


-- VIS_PERSON_WHO_CONSENTED_ID ------------------------------------------------------


-- vis_person_who_consented_id frequency
select vis_person_who_consented_id, count(*) n 
from participant_vis_consent 
group by vis_person_who_consented_id 
order by count(*);


-- vis_consent_response = 1 (yes), but vis_person_who_consented_id is null
select x.vis_consent_response as vis_consent_response_value,
    d.label as vis_consent_response_description,
    vis_person_who_consented_id
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_consent_response = d.value
where d.type_name = 'confirm_type_cl2' 
    and vis_person_who_consented_id is null or vis_person_who_consented_id = '';


-- VIS_WHO_CONSENTED ----------------------------------------------------------------


-- vis_who_consented code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'age_status_cl1'
order by value;


-- vis_who_consented frequency (-4 = Missing in Error)
select x.vis_who_consented as vis_who_consented_value,
   d.label as vis_who_consented_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_who_consented = d.value
where d.type_name = 'age_status_cl1'
group by x.vis_who_consented;


-- VIS_TRANSLATE --------------------------------------------------------------------


-- vis_translate code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'translation_method_cl1'
order by value;


-- vis_translate frequency (-4 = Missing in Error)
select x.vis_translate as vis_translate_value,
   d.label as vis_translate_description,
   count(*) as n
from participant_vis_consent x left outer join
   xsd_enumeration_definition d on x.vis_translate = d.value
where d.type_name = 'translation_method_cl1'
group by x.vis_translate;


-- VIS_COMMENTS ---------------------------------------------------------------------

select vis_comments, count(*) n 
from participant_vis_consent 
group by vis_comments 
order by count(*);
-- ISSUE (reported): what is a vis_comments of -3 (n=186)


-- CONTACT_ID -----------------------------------------------------------------------


-- contact_id is null
select contact_id 
from participant_vis_consent 
where contact_id is null or contact_id = '';


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


/*************************************************************************************
 * table: participant_rvis
 *************************************************************************************/

show columns from participant_rvis;
select count(*) n from participant_rvis;

-- NOTE: no data yet



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
select * from outreach;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- TSU_ID ---------------------------------------------------------------------------


-- tsu_id frequency
select tsu_id, count(*) n 
from outreach group by tsu_id 
order by count(*);
-- ISSUE (reported): what is a tsu_id of -7 (n=390)


-- tsu_id is null
select tsu_id 
from outreach 
where tsu_id is null or tsu_id  = '';


-- SSU_ID ---------------------------------------------------------------------------


-- ssu_id frequency
select ssu_id, count(*) n 
from outreach 
group by ssu_id 
order by count(*);
-- ISSUE (reported): why is there ssu_id = -7 (n=3)


-- TODO: compare ssu_id with health studies data (ncs_prod)


-- ssu_id is null
select ssu_id 
from outreach 
where ssu_id is null or ssu_id  = '';


-- OUTREACH_EVENT_ID ----------------------------------------------------------------


-- outreach_event_id is not unique
select *
from
    (
        select outreach_event_id, count(*) n 
        from outreach 
        group by outreach_event_id 
    ) o
where o.n > 1;


-- outreach_event_id is null
select outreach_event_id 
from outreach 
where outreach_event_id is null or outreach_event_id  = '';


-- OUTREACH_EVENT_DATE --------------------------------------------------------------


-- outreach_event_date oddity
select outreach_event_date, count(*) n 
from outreach 
where (outreach_event_date REGEXP '^9' or outreach_event_date REGEXP '-9+') 
group by outreach_event_date 
order by outreach_event_date;
-- ISSUE (reported): what is outreach_event_date of 96?


-- outreach_event_date is null
select outreach_event_date 
from outreach 
where outreach_event_date is null or outreach_event_date = '';


-- OUTREACH_TARGET & OUTREACH_TARGET_OTH --------------------------------------------


-- outreach_target code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'outreach_target_cl1'
order by value;


-- outreach_target combine list frequency
    -- outreach_target (-5 = Other, -4 = Missing in Error)
    -- outreach_target_oth (-7 = Not Applicable)
select x.outreach_target as outreach_target_value,
    d.label as outreach_target_description,
    outreach_target_oth,
    count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_target = d.value
where d.type_name = 'outreach_target_cl1'
group by x.outreach_target, outreach_target_oth;

-- select outreach_target, outreach_target_oth, count(*) as n
-- from outreach 
-- group by outreach_target, outreach_target_oth;


-- OUTREACH_MODE & OUTREACH_MODE_OTH ------------------------------------------------


-- outreach_mode code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'outreach_mode_cl1'
order by value;


-- outreach_mode combine list frequency
	-- outreach_mode  (-5 = Other, -4 = Missing in Error)
  -- outreach_mode_oth (-7 = Not Applicable)
select x.outreach_mode as outreach_mode_value,
    d.label as outreach_mode_description,
    trim(x.outreach_mode_oth) as outreach_mode_oth,
    count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_mode = d.value
where d.type_name = 'outreach_mode_cl1'
group by x.outreach_mode, x.outreach_mode_oth;
-- ISSUE (reported): is it possible to have outreach_mode of Missing in Error (n=327)?


-- OUTREACH_TYPE & OUTREACH_TYPE_OTH ------------------------------------------------


-- outreach_type code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'outreach_type_cl1'
order by value;


-- outreach_type combine list frequency
	-- outreach_type (-5 = Other, -4 = Missing in Error)
  -- outreach_type_oth (-7 = Not Applicable)
select x.outreach_type as outreach_type_value,
    d.label as outreach_type_description,
    trim(outreach_mode_oth) as outreach_mode_oth,
    count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_type = d.value
where d.type_name = 'outreach_type_cl1'
group by x.outreach_type, x.outreach_mode_oth;


-- OUTREACH_TAILORED ----------------------------------------------------------------


-- outreach_tailored code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- outreach_tailored frequency (-4 = Missing in Error)
select x.outreach_tailored as outreach_tailored_value,
   d.label as outreach_tailored_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_tailored = d.value
where d.type_name = 'confirm_type_cl2'
group by x.outreach_tailored;
-- ISSUE (reported): if outreach_tailored = Yes (n=63), then why is outreach_target and outreach_target_oth both null?


-- OUTREACH_LANG1, OUTREACH_LANG2, OUTREACH_LANG_OTH --------------------------------


-- outreach_lang1 code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- outreach_lang1 frequency (-4 = Missing in Error)
select x.outreach_lang1 as outreach_lang1_value,
   d.label as outreach_lang1_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_lang1 = d.value
where d.type_name = 'confirm_type_cl2'
group by x.outreach_lang1;


-- outreach_lang2 code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- outreach_lang2 frequency (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
select outreach_lang2, outreach_lang_oth, count(*) n 
from outreach 
group by outreach_lang2, outreach_lang_oth 
order by outreach_lang2, outreach_lang_oth ;


-- data in outreach_lang1, outreach_lang2, and outreach_lang_oth corrobarate
select a.is_lanaguage_specific_value, 
    a.is_lanaguage_specific_description,
    a.language_value, 
    a.language_description, 
    a.language_oth, 
    count(a.outreach_event_id) n
from
    (
        select o.outreach_event_id, 
            ls.is_lanaguage_specific_value, 
            ls.is_lanaguage_specific_description,
            l.language_value, 
            l.language_description, 
            if(o.outreach_lang_oth = -7, 'Not Applicable', o.outreach_lang_oth) as language_oth
        from outreach o left outer join
            (
                select x.outreach_event_id, 
                    x.outreach_lang1 as is_lanaguage_specific_value,
                    d.label as is_lanaguage_specific_description
                from outreach x left outer join
                   xsd_enumeration_definition d on x.outreach_lang1 = d.value
                where d.type_name = 'confirm_type_cl2'
            ) ls on o.outreach_event_id = ls.outreach_event_id left outer join
            (
                select x.outreach_event_id, 
                    x.outreach_lang2 as language_value,
                    d.label as language_description
                from outreach x left outer join
                   xsd_enumeration_definition d on x.outreach_lang2 = d.value
                where d.type_name = 'language_cl2'
            ) l on o.outreach_event_id = l.outreach_event_id
    ) a
group by a.is_lanaguage_specific_value, a.is_lanaguage_specific_description, a.language_value, a.language_description, a.language_oth;
-- ISSUE (reported): Of the 36 outreach_event_id in which outreach_lang1 = 1 (yes)
    -- 36 indicates outreach_lang2 = null, and 
    -- 25 indicates outreach_lang_oth = -7 (Not Applicable)


-- OUTREACH_RACE1, OUTREACH_RACE2, OUTREACH_RACE_OTH --------------------------------


-- outreach_race1 code list (-4 = Missing in Error, -3 = Legitimate Skip)
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
where d.type_name = 'confirm_type_cl6'
group by x.outreach_race1;


-- outreach_race2 code list (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
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
where d.type_name = 'race_cl3'
group by x.outreach_race2;

select outreach_race2, count(*)
from outreach
group by outreach_race2;

-- ISSUE (reported): outreach_race2 is null, but outreach_race1 (n=23) suggust some outreach was specific to a race


-- outreach_lang_oth
select outreach_race_oth, count(*) n 
from outreach 
group by outreach_race_oth 
order by outreach_race_oth ;


-- OUTREACH_CULTURE1, OUTREACH_CULTURE2, OUTREACH_CULTURE_OTH -----------------------


-- outreach_culture1 code list (-4 = Missing in Error, -3 = Legitimate Skip)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl6'
order by value;


-- outreach_culture1 frequency  (-4 = Missing in Error, -3 = Legitimate Skip)
select x.outreach_culture1 as outreach_culture1_value,
   d.label as outreach_culture1_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_culture1 = d.value
where d.type_name = 'confirm_type_cl6'
group by x.outreach_culture1;
-- ISSUE (reported): outreach_culture1 of 'Missing in Error" seems high (n = 327)


-- outreach_culture2 code list (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'culture_cl1'
order by value;


-- outreach_culture2 frequency (-7 = Not Applicable, -5 = Other, -4 = Missing in Error)
select x.outreach_culture2 as outreach_culture2_value,
   d.label as outreach_culture2_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_culture2 = d.value
where d.type_name = 'culture_cl1'
group by x.outreach_culture2;


-- outreach_culture_oth frequency
select outreach_culture_oth, count(*) n 
from outreach 
group by outreach_culture_oth 
order by outreach_culture_oth;


-- outreach_culture1, outreach_culture2, and outreach_culture_oth corroberate
select a.outreach_is_cultural_specific_value, 
	a.outreach_is_cultural_specific_description,
	a.outreach_culture_value, 
	a.outreach_culture_description,
	a.outreach_culture_oth, 
	count(a.outreach_event_id) n
from
	(
		select o.outreach_event_id, 
			i.outreach_is_cultural_specific_value, 
			i.outreach_is_cultural_specific_description,
			c.outreach_culture_value, 
			c.outreach_culture_description,
			o.outreach_culture_oth
		from outreach o left outer join
			(
				select x.outreach_event_id, 
					x.outreach_culture1 as outreach_is_cultural_specific_value,
					d.label as outreach_is_cultural_specific_description
				from outreach x left outer join
					xsd_enumeration_definition d on x.outreach_culture1 = d.value
				where d.type_name = 'confirm_type_cl6'
			) i on o.outreach_event_id = i.outreach_event_id left outer join
			(
				select outreach_event_id, 
					x.outreach_culture2 as outreach_culture_value,
					d.label as outreach_culture_description
				from outreach x left outer join
					xsd_enumeration_definition d on x.outreach_culture2 = d.value
				where d.type_name = 'culture_cl1'
			) c on o.outreach_event_id = c.outreach_event_id
	) a
group by a.outreach_is_cultural_specific_value, 
	a.outreach_is_cultural_specific_description,
	a.outreach_culture_value, 
	a.outreach_culture_description,
	a.outreach_culture_oth;
-- ISSUE (reported): of 45 outreach_event_id, in which outreach_culture1 = No, 1 outreach_event_id indicates outreach_culture2 of 1.


-- OUTREACH_QUANTITY ----------------------------------------------------------------


-- outreach_quantity frequency
select outreach_quantity, count(*) n 
from outreach 
group by outreach_quantity 
order by outreach_quantity;
-- ISSUE (reported): what is an outreach_quantity of -4 (n=2)


-- TODO: outreach_quantity by outreach_mode & outreach_mode_oth) and outreach_type (& outreach_type_oth)


-- OUTREACH_COST --------------------------------------------------------------------


-- outreach_cost frequency
select outreach_cost, count(*) n 
from outreach 
group by outreach_cost 
order by outreach_cost;


-- TODO: outreach_cost by outreach_quantity, outreach_mode & outreach_mode_oth) and outreach_type (& outreach_type_oth)


-- OUTREACH_STAFFING ----------------------------------------------------------------


-- outreach_staffing frequency
select outreach_staffing, count(*) n 
from outreach 
group by outreach_staffing 
order by outreach_staffing;


-- TODO: outreach_staffing, outreach_cost, outreach_quantity, outreach_mode & outreach_mode_oth) and outreach_type (& outreach_type_oth)


-- OUTREACH_INCIDENT & INCIDENT_ID --------------------------------------------------


-- outreach_incident code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- outreach_incident frequency (-4 = Missing in Error)
select x.outreach_incident as outreach_incident_value,
	d.label as outreach_incident_description,
	incident_id, 
	count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_incident = d.value
where d.type_name = 'confirm_type_cl2'
group by x.outreach_incident;


-- OUTREACH_EVAL_RESULT -------------------------------------------------------------


-- outreach_eval_result code list (-4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'success_level_cl1'
order by value;


-- outreach_eval_result frequency (-4 = Missing in Error)
select x.outreach_eval_result as outreach_eval_result,
   d.label as eval_result_description,
   count(*) as n
from outreach x left outer join
   xsd_enumeration_definition d on x.outreach_eval_result = d.value
where d.type_name = 'success_level_cl1'
group by x.outreach_eval_result;


-- TRANSACTION_TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from outreach
group by transaction_type;



/*************************************************************************************
 * table: outreach_eval
 *************************************************************************************/

show columns from outreach_eval;
select count(*) n from outreach_eval;
select * from outreach_eval;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- OUTREACH_EVENT_EVAL_ID -----------------------------------------------------------


-- outreach_event_eval_id frequency
select outreach_event_eval_id, count(*) n 
from outreach_eval 
group by outreach_event_eval_id 
order by outreach_event_eval_id;


-- outreach_event_eval_id is not unique?
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
where outreach_event_eval_id is null or outreach_event_eval_id = '';


-- OUTREACH_EVENT_ID ----------------------------------------------------------------


-- outreach_event_id frequency
select outreach_event_id, count(*) n 
from outreach_eval 
group by outreach_event_id 
order by outreach_event_id;

-- outreach_event_id is not unique?
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
where outreach_event_id is null or outreach_event_id = '';


-- OUTREACH_EVAL & OUTREACH_EVAL_OTH ------------------------------------------------


-- outreach_eval code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'outreach_eval_cl1'
order by value;


-- outreach_eval frequency (-5 = Other, -4 = Missing in Error)
select x.outreach_eval as outreach_eval,
   d.label as outreach_eval_description,
   x.outreach_eval_oth, 
   count(*) as n
from outreach_eval  x left outer join
   xsd_enumeration_definition d on x.outreach_eval = d.value
where d.type_name = 'outreach_eval_cl1'
group by x.outreach_eval, x.outreach_eval_oth;
-- ISSUE (reported): outreach_eval of 'Missing in Error' (n=386) seems high?


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


 
/*************************************************************************************
 * table: outreach_lang2
 *************************************************************************************/

show columns from outreach_lang2;
select count(*) n from outreach_lang2;
select * from outreach_lang2;

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
where outreach_lang2_id is null or outreach_lang2_id = '';


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
where outreach_event_id is null or outreach_event_id = '';


-- OUTREACH_LANG2 -------------------------------------------------------------------


-- outreach_lang2 code list (-6 = Unknown, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- outreach_lang2 frequency (-6 = Unknown, -5 = Other, -4 = Missing in Error)
select x.outreach_lang2 as outreach_lang2,
   d.label as outreach_lang2_description,
   count(*) as n
from outreach_lang2 x left outer join
   xsd_enumeration_definition d on x.outreach_lang2 = d.value
where d.type_name = 'language_cl2'
group by x.outreach_lang2;


-- TODO: does outreach_lang2.outreach_lang2 corroberate with outreach.lang1, - lang2, -lang_oth? 


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


 
/*************************************************************************************
 * table: outreach_race 
 *************************************************************************************/
Use ncs_mdes_prod;
Use ncs_mdes_6_04;

show columns from outreach_race;
select count(*) n from outreach_race;
select * from outreach_race;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- OUTREACH_RACE_ID -----------------------------------------------------------------

-- outreach_race_id frequency
select outreach_race_id, count(*) n
from outreach_race 
group by outreach_race_id
order by outreach_race_id desc;


-- outreach_race_id is null
select *
from outreach_race 
where outreach_race_id is null or outreach_race_id = '';


-- outreach_race_id is not unique
select *
from 
	(
		select outreach_race_id, count(*) n
		from outreach_race 
		group by outreach_race_id
	) o
where o.n > 1;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------


-- outreach_event_id frequency
select outreach_event_id, count(*) n
from outreach_race 
group by outreach_event_id
order by outreach_event_id desc;


-- outreach_event_id is null
select *
from outreach_race 
where outreach_event_id is null or outreach_event_id = '';


-- outreach_event_id is not unique
select *
from 
	(
		select outreach_event_id, count(*) n
		from outreach_race 
		group by outreach_race_id
	) o
where o.n > 1;


-- OUTREACH_RACE2 & OUTREACH_RACE_OTH -----------------------------------------------


-- outreach_race2 code list (-7 = Not applicable, -5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'race_cl3'
order by value;


-- outreach_race2 combine list frequency 
    -- outreach_race2 (-7 = Not applicable, -5 = Other, -4 = Missing in Error)
    -- outreach_race2_oth (-7 = Not applicable)
select x.outreach_race2 as outreach_race2,
    d.label as outreach_race2_description,
    x.outreach_race_oth, 
    count(*) as n
from outreach_race x left outer join
   xsd_enumeration_definition d on x.outreach_race2 = d.value
where d.type_name = 'race_cl3'
group by x.outreach_race2, x.outreach_race_oth;


-- TODO: does outreach_race.outreach_race2 and -outreach_race_oth corroberate with outreach.outreach_race1 -race2, and race_oth?


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 


/*************************************************************************************
 * table: outreach_staff
 *************************************************************************************/

show columns from outreach_staff;
select count(*) n from outreach_staff;
select * from outreach_staff;

-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- OUTREACH_EVENT_STAFF_ID ----------------------------------------------------------


-- outreach_event_staff_id frequency
select outreach_event_staff_id, count(*) n
from outreach_staff 
group by outreach_event_staff_id
order by outreach_event_staff_id desc;


-- outreach_event_staff_id is null
select *
from outreach_staff 
where outreach_event_staff_id is null or outreach_event_staff_id = '';


-- outreach_event_staff_id is not unique
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
where outreach_event_id is null or outreach_event_id = '';

select *
from 
	(
		select outreach_event_id, count(*) n
		from outreach_staff 
		group by outreach_event_id
	) o
where o.n > 1;

select *
from outreach_staff 
where outreach_event_id = '20000048_1';


-- STAFF_ID -------------------------------------------------------------------------


-- staff_id frequency
select staff_id, count(*) n
from outreach_staff 
group by staff_id
order by staff_id desc;


-- staff_id is null
select *
from outreach_staff 
where staff_id is null or staff_id = '';


-- staff_id is not unique
select *
from 
	(
		select staff_id, count(*) n
		from outreach_staff 
		group by staff_id
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


-- outreach_target_id frequency
select outreach_target_id, count(*) n
from outreach_target 
group by outreach_target_id
order by count(*);


-- outreach_target_id is null
select *
from outreach_target 
where outreach_target_id is null or outreach_target_id = '';


-- outreach_target_id in not unique
select *
from 
	(
		select outreach_target_id, count(*) n
		from outreach_target 
		group by outreach_target_id
	) o
where o.n > 1;


-- OUTREACH_EVENT_ID ----------------------------------------------------------------

-- outreach_event_id frequency
select outreach_event_id, count(*) n
from outreach_target 
group by outreach_event_id
order by count(*);


-- outreach_event_id is null
select *
from outreach_target 
where outreach_event_id is null or outreach_event_id = '';


-- outreach_event_id is not unique
select *
from 
	(
		select outreach_event_id, count(*) n
		from outreach_target 
		group by outreach_event_id
	) o
where o.n > 1;

select *
from outreach_target 
where outreach_event_id = '20000048_101';


-- OUTREACH_TARGET_MS & OUTREACH_TARGET_MS_OTH --------------------------------------


-- outreach_target_ms code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'outreach_target_cl1'
order by value;


-- outreach_race2 frequency
    -- outreach_target_ms (-5 = Other, -4 = Missing in Error)
    -- outreach_target_ms_oth (-7 = Not Applicable)
select x.outreach_target_ms as outreach_target_ms,
    d.label as outreach_target_ms_description,
    x.outreach_target_ms_oth, 
    count(*) as n
from outreach_target x left outer join
   xsd_enumeration_definition d on x.outreach_target_ms = d.value
where d.type_name = 'outreach_target_cl1'
group by x.outreach_target_ms, x.outreach_target_ms_oth;


-- TODO: does outreach_target.outreach_target (including outreach_target_oth) corroberate with outreach.target (including target_oth)


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
select * from staff;


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
where d.type_name = 'study_staff_type_cl1'
group by x.staff_type, x.staff_type_oth
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
where d.type_name = 'study_staff_type_cl1';
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
where d.type_name = 'confirm_type_cl2'
group by x.subcontractor
order by d.value;


-- STAFF_YOB ------------------------------------------------------------------------


-- staff_yob frequency
select staff_yob, count(*) n
from staff 
group by staff_yob
order by staff_yob desc;
-- ISSUE (reported): what does a year of that 9666 (n=29) mean?


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
where d.type_name = 'age_range_cl1'
group by x.staff_age_range
order by d.value;
-- ISSUE (reported): is 'Missing in Error' staff_age_range (n=25) acceptable?


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
where d.type_name = 'gender_cl1'
group by x.staff_gender;
-- ISSUE (reported): is 'Missing in Error" staff_gender (n=25) acceptable?


-- STAFF_RACE & STAFF_RACE_OTH ------------------------------------------------------


-- staff_race code list (-6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused)
select *
from xsd_enumeration_definition 
where type_name = 'race_cl1'
order by value;
-- ISSUE (reported): what is the difference between UNKNOWN and MISSING IN ERROR staff_race?  


-- staff_race combined list (staff_race + staff_race_oth)
	-- staff_race: -6 = Unknown, -5 = Other, -4 = Missing in Error, -1 = Refused
	-- staff_race_oth: -7 = Not Applicable
select x.staff_race as staff_race_value,
   d.label as staff_race_description,
   if(x.staff_race_oth = -7, 'Not Applicable', x.staff_race_oth) as staff_race_oth,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_race = d.value
where d.type_name = 'race_cl1'
group by x.staff_race, x.staff_race_oth
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
where d.type_name = 'race_cl1';
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
-- ISSUE (reported): what is the difference between staff_ethnicity UNKNOWN and MISSING IN ERROR 


-- staff_ethnicity frequency
select x.staff_ethnicity as staff_ethnicity_value,
   d.label as staff_ethnicity_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_ethnicity = d.value
where d.type_name = 'ethnicity_cl1'
group by x.staff_ethnicity;


-- STAFF_EXP ------------------------------------------------------------------------


-- staff_exp code list (-7 = Not Applicable, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'experience_level_cl1'
order by value;


-- staff_exp frequency (-7 = Not Applicable, -4 = Missing in Error)
select x.staff_exp as staff_exp_value,
   d.label as staff_exp_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_exp = d.value
where d.type_name = 'experience_level_cl1'
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
-- QUESTION: the prefixe of a staff_cert_list_id is the staff_id, what does the rest of the id represent.


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
where d.type_name = 'certificate_type_cl1'
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
where d.type_name = 'confirm_type_cl2'
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
where d.type_name = 'background_chck_lvl_cl1'
group by x.staff_bgcheck_lvl;
-- ISSUE (reported): is staff_bgcheck_lvl of MISSING IN ERROR (n=506) acceptable?


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
-- ISSUE (reported): is it possible that a cert_train_type can have multiple staff_bgcheck_lvl?


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
-- ISSUE (reported): what does a cert_type_exp_date of '9777-97-97' mean?


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
-- ISSUE (reported): weekly_exp_id does not follow the same convention. 
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
-- ISSUE (reported): is it possibe to have zero staff_hours here (n=12)?

-- STAFF_EXPENSES -------------------------------------------------------------------


-- staff_expenses
select staff_expenses, count(*) n
from staff_weekly_expense
group by staff_expenses
order by staff_expenses desc;
-- ISSUE (reported): is it possible to have zero staff_expenses (n=6796)?


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
-- ISSUE (reported): what does weekly_expenses_comment of -7 mean?


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

-- ISSUE (reported): how is the staff (staff_id) linked data in this table?  
-- ISSUE (reported): what is the makeup of the staff_exp_data_coll_task_id (psu_id + staff_id + what date?)?


-- staff_exp_data_coll_task_id frequency
select staff_exp_data_coll_task_id, count(*) n
from staff_exp_data_cllctn_tasks
group by staff_exp_data_coll_task_id
order by staff_exp_data_coll_task_id desc;
-- ?? ISSUE: what is the makeup of the staff_weekly_expense_id because it does not seem consistent (e.g., 20000048_RCSU90_2011-09-11, 20000048_1020)


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
-- ?? ISSUE: what is the makeup of the staff_weekly_expense_id because it does not seem consistent (e.g., 20000048_RCSU90_2011-09-11, 20000048_1020)


-- staff_exp_data_coll_task_id compared to staff_weekly_expense_id
select staff_exp_data_coll_task_id, staff_weekly_expense_id
from staff_exp_data_cllctn_tasks
where staff_exp_data_coll_task_id = staff_weekly_expense_id
group by staff_exp_data_coll_task_id, staff_weekly_expense_id
order by count(*) desc;
-- ISSUE (reported): why is select staff_exp_data_coll_task_id the same as the staff_weekly_expense_id?


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
-- ISSUE (reported): what is the difference between data_coll_task_type_oth 'Administrative task' versus 'Administrative tasks', and 'Trainimg' and 'Training'
-- ISSUE (reported): what does data_coll_task_type_oth = -4 mean?


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
-- ISSUE (reported): what data_coll_tasks_hrs = -4 mean?


-- which staff_exp_data_coll_task_id does not have reported data_coll_tasks_hrs?
select * 
from staff_exp_data_cllctn_tasks
where data_coll_tasks_hrs is null or data_coll_tasks_hrs = '';


-- DATA_COLL_TASK_CASES -------------------------------------------------------------

select data_coll_task_cases, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_task_cases
order by data_coll_task_cases desc;
-- ISSUE (reported): what does data_coll_task_cases = -4 mean?


-- DATA_COLL_TRANSMIT ---------------------------------------------------------------

select data_coll_transmit, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_transmit
order by data_coll_transmit desc;
-- ISSUE (reported): what does data_coll_transmit = -7 mean?


-- DATA_COLL_TASK_COMMENT -----------------------------------------------------------

select data_coll_task_comment, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_task_comment
order by data_coll_task_comment desc;
-- ISSUE (reported): what does data_coll_task_comment = -7 mean?


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
-- ISSUE: staff_exp_mgmt_task_id does not consistently follow the same convention


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
-- ISSUE (reported): staff_weekly_expense_id does not consistently follow the same convention


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
-- ISSUE (reported): what is mgmt_task_type_oth of -4 (n=44)?


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
-- ISSUE (reported): what does a mgmt_task_comment of -7 mean?


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 


/*************************************************************************************
 *
 * 		INSTITUTION & PROVIDER 
 *
 * 		Institution: 
 * 				institution (n=9)
 * 				link_person_institute
 * 				
 * 		Provider: 
 * 				provider
 * 				provider_role
 * 				link_person_provider
 *
 *************************************************************************************/




/*************************************************************************************
 * table: institution
 *************************************************************************************/

show columns from institution;
select count(*) n from institution;
select * from institution;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- INSTITUTUTE_ID -------------------------------------------------------------------


-- institute_id is not unique
select *
from institution
where institute_id is null or institute_id = '';


-- INSTITUTUTE_NAME -----------------------------------------------------------------


-- institute_name frequency
select institute_name, count(*) n
from institution
group by institute_name;


-- institute_name is null
select *
from institution
where institute_name is null or institute_name = '';


-- INSTITUTUTE_TYPE & INSTITUTUTE_TYPE_OTH ------------------------------------------


-- institute_type code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'organization_type_cl1'
order by value;


-- institute_type combined list frequency
    -- institute_type (-5 = Other, -4 = Missing in Error)
    -- institute_type_oth (-7 = Not Applicable)
select x.institute_type as institute_type_value,
   d.label as institute_type_description,
   x.institute_type_oth,
   count(*) as n
from institution x left outer join
   xsd_enumeration_definition d on x.institute_type = d.value
where d.type_name = 'organization_type_cl1'
group by x.institute_type, x.institute_type_oth
order by x.institute_type;


-- INSTITUTUTE_RELATION & INSTITUTUTE_RELATION_OTH ----------------------------------


-- institute_relation code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'person_orgnztn_function_cl1'
order by value;


-- institute_relation combined list frequency
    -- institute_relation (-5 = Other, -4 = Missing in Error)
    -- institute_relation_oth (-7 = Not Applicable)
select x.institute_relation as institute_relation_value,
   d.label as institute_relation_description,
   x.institute_relation_oth,
   count(*) as n
from institution x left outer join
   xsd_enumeration_definition d on x.institute_relation = d.value
where d.type_name = 'organization_type_cl1'
group by x.institute_relation, x.institute_relation_oth
order by x.institute_relation;


-- INSTITUTUTE_OWNER & INSTITUTUTE_OWNER_OTH ----------------------------------------


-- institute_owner code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'organization_ownership_cl1'
order by value;


-- institute_owner combined list frequency
    -- institute_owner (-5 = Other, -4 = Missing in Error)
    -- institute_owner_oth (-7 = Not Applicable)
select x.institute_owner as institute_owner_value,
   d.label as institute_owner_description,
   x.institute_owner_oth,
   count(*) as n
from institution x left outer join
   xsd_enumeration_definition d on x.institute_owner = d.value
where d.type_name = 'organization_ownership_cl1'
group by x.institute_owner, x.institute_owner_oth
order by x.institute_owner;


-- INSTITUTUTE_SIZE -----------------------------------------------------------------


-- institute_size frequency
select institute_id, institute_name, institute_size
from institution;


-- institute_size is null
select *
from institution
where institute_size is null or institute_size = '';


-- INSTITUTUTE_UNIT & INSTITUTUTE_UNIT_OTH ------------------------------------------


-- institute_unit code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'organization_size_unit_cl1'
order by value;


-- institute_unit combined list frequency
    -- institute_unit (-5 = Other, -4 = Missing in Error)
    -- institute_unit_oth (-7 = Not Applicable)
select x.institute_unit as institute_unit_value,
   d.label as institute_unit_description,
   x.institute_unit_oth,
   count(*) as n
from institution x left outer join
   xsd_enumeration_definition d on x.institute_unit = d.value
where d.type_name = 'organization_size_unit_cl1'
group by x.institute_type, x.institute_unit_oth
order by x.institute_unit;


-- INSTITUTUTE_INFO_SOURCE & INSTITUTUTE_INFO_SOURCE_OTH ----------------------------


-- institute_info_source code list (-5 = Other, -4 = Missing in Error)
select *
from xsd_enumeration_definition 
where type_name = 'information_source_cl2'
order by value;


-- institute_info_source combined list frequency
    -- institute_info_source (-5 = Other, -4 = Missing in Error)
    -- institute_info_source_oth (-7 = Not Applicable)
select x.institute_info_source as institute_info_source_value,
   d.label as institute_info_source_description,
   x.institute_info_source_oth,
   count(*) as n
from institution x left outer join
   xsd_enumeration_definition d on x.institute_info_source = d.value
where d.type_name = 'information_source_cl2'
group by x.institute_info_source, x.institute_info_source_oth
order by x.institute_info_source;


-- INSTITUTUTE_INFO_DATE ------------------------------------------------------------

-- institute_info_date frequency
select institute_info_date, count(*) n
from institution
group by institute_info_date
order by institute_info_date;


-- phone_info_date oddity
select institute_info_date, count(*) n
from institution
where (institute_info_date REGEXP '^9' or institute_info_date REGEXP '-9+');


-- INSTITUTUTE_INFO_UPDATE ----------------------------------------------------------


-- institute_info_update frequency
select institute_info_update, count(*) n
from institution
group by institute_info_update
order by institute_info_update;


-- institute_info_update oddity
select institute_info_update, count(*) n
from institution
where (institute_info_update REGEXP '^9' or institute_info_update REGEXP '-9+');
-- ISSUE (reported): what is a institute_info_update of 9666-96-96?


-- INSTITUTUTE_COMMENT --------------------------------------------------------------


-- institute_comment frquency
select institute_comment, count(*) n
from institution 
group by institute_comment
order by institute_comment desc;
-- ISSUE (reported): what is institute_comment of -7 mean?


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
