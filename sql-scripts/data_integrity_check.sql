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


/*************************************************************************************
 * PERSON AND PARTICIPANTS
 *************************************************************************************/


/*************************************************************************************
 * table; link_person_participant
 *************************************************************************************/

show columns from link_person_participant;
select count(*) n from link_person_participant;


-- PSU_ID ---------------------------------------------------------------------------

-- count
select l.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.psu_id = d.value
where type_name = 'psu_cl1'
group by l.psu_id;

-- psu_id  is not correct
select * from link_person_participant where psu_id != 20000048;


-- PERSON_PID_ID --------------------------------------------------------------------

-- count
select person_pid_id, count(*) n
from link_person_participant 
group by person_pid_id;

--  is not unique
select *
from ( select person_pid_id, count(*) n from link_person_participant  group by person_pid_id ) l
where l.n > 1;


-- P_ID -----------------------------------------------------------------------------

-- p_id count
select p_id, count(*) n from link_person_participant group by p_id order by count(*) desc;


-- PERSON_ID ------------------------------------------------------------------------

-- person_id count
select person_id, count(*) from link_person_participant group by person_id order by count(*) desc; 

-- person_id is null
select person_id, count(*) from link_person_participant where person_id is null group by person_id;


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


-- IS_ACTIVE ------------------------------------------------------------------------

-- count
select l.is_active as is_active_value,
   d.label as relation_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where type_name = 'confirm_type_cl2'
group by l.is_active;

-- inactive links
select l.is_active as is_active_value,
   d.label as relation_description,
   count(l.id) as n
from link_person_participant l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where type_name = 'confirm_type_cl2' 
	and l.is_active != 1 or l.is_active is null
group by l.is_active;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from link_person_participant
group by transaction_type;


/*************************************************************************************
 * table: participant
 *************************************************************************************/

show columns from participant;
select count(*) n from participant;


-- PSU_ID ---------------------------------------------------------------------------

-- count
select p.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where type_name = 'psu_cl1'
group by p.psu_id;

-- psu_id  is not correct
select * from participant where psu_id != 20000048;


-- P_ID -----------------------------------------------------------------------------

select p_id, count(*) n
from participant 
group by p_id;

-- more than one p_id

select * 
from ( select p_id, count(*) n from participant group by p_id ) p
where p.n > 1;	


-- P_TYPE & P_TYPE_OTH --------------------------------------------------------------

-- p_type

select p.p_type as p_type_value,
   d.label as p_type_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.p_type = d.value
where type_name = 'participant_type_cl1'
group by p.p_type;

-- TODO: does participant.p_type = 'NCS Child)'(6) match up with link_person_participant.relation = 'Child' (8)
-- TODO: how does participant.p_type (study eligibility) compare to ppg_details.ppg_pid_status?

-- p_type_oth

select p_type_oth as p_type_oth_value,
   case when p_type_oth = -7 then 'Not Applicable' else p_type_oth end as p_type_oth_description,
   count(*) n
from participant
group by p_type_oth;


-- STATUS_INFO_SOURCE, STATUS_INFO_SOURCE_OTH, STATUS_INFO_MODE, STATUS_INFO_MODE_OTH, STATUS_INFO_DATE

-- status_info_source

select p.status_info_source as status_info_source_value,
   d.label as status_info_source_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.status_info_source = d.value
where type_name = 'information_source_cl4'
group by p.status_info_source;

-- status_info_source_oth

select status_info_source_oth as status_info_source_oth_value,
   case when status_info_source_oth = -7 then 'Not Applicable' else status_info_source_oth end as status_info_source_oth_description,
   count(*) n
from participant
group by status_info_source_oth;

-- status_info_mode

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

-- status_info_date

select status_info_date, count(*) n from participant group by status_info_date order by count(*) desc;


-- ENROLL_STAUTS & ENROLL_DATE ------------------------------------------------------

-- enroll_status

-- possible enroll status

select * from xsd_enumeration_definition where type_name = 'confirm_type_cl2';

-- enroll_status count

select p.enroll_status as enroll_status_value,
   d.label as enroll_status_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.enroll_status = d.value
where type_name = 'confirm_type_cl2'
group by p.enroll_status;

-- enroll_date

select enroll_date, count(*) n from participant group by enroll_date order by count(*) desc;

-- TODO: does participant.enroll_status match up with participant.enroll_date?


-- PID_ENTRY & PID_ENTRY_OTHER ------------------------------------------------------

-- pid_entry

select p.pid_entry as pid_entry_value,
   d.label as pid_entry_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.pid_entry = d.value
where type_name = 'study_entry_method_cl1'
group by p.pid_entry;

-- pid_entry_other

select pid_entry_other as pid_entry_other_value,
   case
       when pid_entry_other = -7 then 'Not Applicable'
       else pid_entry_other
   end as pid_entry_other_description,
   count(*) n
from participant
group by pid_entry_other;


-- PID_AGE_ELIG ---------------------------------------------------------------------

select p.pid_age_elig as pid_age_elig_value,
   d.label as pid_age_elig_description,
   count(p.id) as n
from participant p left outer join
   xsd_enumeration_definition d on p.pid_age_elig = d.value
where type_name = 'age_eligible_cl2'
group by p.pid_age_elig;

-- TODO: how does participant.P_TYPE match up to participant.PID_AGE_ELIG?


-- PID_COMMENT ----------------------------------------------------------------------

select pid_comment, count(*) n
from participant
group by pid_comment;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from participant
group by transaction_type;



/*************************************************************************************
 * table: person
 *************************************************************************************/

show columns from person;
select count(*) n from person;


-- PSU_ID ---------------------------------------------------------------------------

-- count
select p.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where type_name = 'psu_cl1'
group by p.psu_id;


-- psu_id  is not correct
select * from person where psu_id != 20000048;


-- PERSON_ID ------------------------------------------------------------------------

select person_id, count(*) from person group by person_id;
-- ISSUE: 
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

select p.prefix as prefix_value, 
	d.label as prefix_description, 
	count(p.id) as n
from person p left outer join
	xsd_enumeration_definition d on p.prefix = d.value
where d.type_name = 'name_prefix_cl1'
group by prefix;

-- ISSUE: all prefixes are "NA"


-- FIRST_NAME -----------------------------------------------------------------------

-- count
select first_name, count(*) n from person group by first_name order by first_name;
-- ISSUES: firstnames that are
	-- null (n=3900)
	-- '-3' (n=22)
	-- '26' (n=1)
	-- '30' (n=1)

-- null first names
-- ISSUE: 390 rows with null first_name
select count(*) 
from person 
where first_name is null;

-- ISSUE: of 390 null first names, most do not have a middle or last name
select first_name, middle_name, last_name
from person 
where first_name is null;

-- first names that have odd non-alpha characters (excludes single quote, hyphen, space)
select p.first_name, count(*) n
from
   (
		select id, first_name
		from person
		where first_name not REGEXP "^[A-Za-z\\'\\ \\-]+$" 
   ) p
group by p.first_name;
-- ISSUE: first names with parenthesis, period, comma, slash, and number

-- first names that have a period (suggesting person had middle name) but person also has a name provided in middle name column
select id, first_name,  middle_name
from person
where  first_name REGEXP '[.]' and middle_name != -7;

-- TODO: how may of first name oddities are participants


-- LAST_NAME ------------------------------------------------------------------------

-- count
select last_name, count(*) n from person group by last_name;

-- null last names
select count(*) from person  where last_name is null;

-- ISSUE: 3 null last names
select first_name, middle_name, last_name from person where last_name is null;

-- last names that have other characters that are not alpha characters or a period
-- first names that have odd non-alpha characters (excludes single quote, hyphen, space)
select p.last_name, count(*) n
from
   (
		select id, last_name
		from person
		where last_name not REGEXP "^[A-Za-z\\'\\ \\-]+$" 
   ) p
group by p.last_name;

-- TODO: how may of last name oddities are participants


-- MIDDLE NAME ----------------------------------------------------------------------

-- count
select middle_name, count(*) n from person group by middle_name;

-- null middle names
select count(*) from person  where middle_name is null;

-- middle names that have odd non-alpha characters (excludes single quote, hyphen, space, period)
select p.middle_name, count(*) n
from
   (
		select id, middle_name
		from person
		where middle_name not REGEXP "^[A-Za-z\\'\\ \\-\\.]+$" 
   ) p
group by p.middle_name;


-- TODO: Are any person with name abnomallies are participants?


-- MAIDEN NAME ----------------------------------------------------------------------

-- count
select case when maiden_name = -7 then 'not applicable' else maiden_name end as maiden_name, count(*) n from person group by maiden_name;


-- SUFFIX ---------------------------------------------------------------------------

-- count
select suffix as suffix_value,
	d.label as suffix_description, 
   	count(*) n
from person p left outer join
   xsd_enumeration_definition d on p.suffix = d.value
where type_name = 'name_suffix_cl1'
group by suffix;
-- ISSUE: all person.suffix are null


-- TITLE ----------------------------------------------------------------------------

-- count
select title as title_code,
	case 
		when title = -7 then 'NA' 
		else title 
	end as title_description,
	count(*) n
from person
group by title;
-- ISSUE: all person.title are null


-- SEX ------------------------------------------------------------------------------

-- count
select p.sex, d.label, count(*) n
from person p left outer join
   xsd_enumeration_definition d on p.sex = d.value
where type_name = 'gender_cl1'
group by p.sex, d.label;

-- TODO: do any of the participants have an UNKNOWN gender?


-- AGE ------------------------------------------------------------------------------

-- count
select age, count(*) n from person group by age;

-- odd or missing age
select a.age age_value,
   case
       when a.age = -6 then 'unknown'
       when a.age = -4 then 'Missing in Error'
       when a.age = -1 then 'Refused'
       else convert(a.age, char(2))
   end as age_description,
   a.n
from
   (
       select age, count(*) n
       from person
       where age < 0
       group by age
   ) a;


-- AGE RANGE ------------------------------------------------------------------------

-- count
select p.age_range, d.label, p.n
from
   (
       select age_range, count(*)  n
       from person
       group by age_range
       order by age_range
   ) p left outer join
   xsd_enumeration_definition d on p.age_range = d.value
where type_name = 'age_range_cl1';


-- PERSON_DOB -----------------------------------------------------------------------

select person_dob, count(*) n from person;


-- TODO: COMPARE AGE, AGE_RAGE AND PERSON_DOB ----------------------------------------


-- DECEASED -------------------------------------------------------------------------

select p.deceased as deceased_value, d.label as deceased_description, p.n
from
   (
       select deceased, count(*) n
       from person
       group by deceased
   ) p left outer join
   xsd_enumeration_definition d on p.deceased = d.value
where type_name = 'confirm_type_cl2';


-- ETHNIC GROUP ---------------------------------------------------------------------

select p.ethnic_group as ethnic_group_value,
   d.label as ethnic_group_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.age_range = d.value
where type_name = 'ethnicity_cl1'
group by p.ethnic_group;


-- PERSON_LANG ----------------------------------------------------------------------

select p.person_lang as person_lang_value,
   d.label as person_lang_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.person_lang = d.value
where type_name = 'language_cl2'
group by p.person_lang;


-- PERSON_LANG_OTH ------------------------------------------------------------------

select person_lang_oth, count(*)
from person
group by person_lang_oth;


-- TODO: PERSON_LANG & PERSON_LANG_OTH comparison -----------------------------------


-- MARISTAT & MARISTAT_OTH ----------------------------------------------------------

-- maristat

select p.maristat as maristat_value,
   d.label as maristat_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.maristat = d.value
where type_name = 'marital_status_cl1'
group by p.maristat;

-- maristat_oth

select maristat_oth as maristat_oth_value,
   case when maristat_oth = -7 then 'Not Applicable' else maristat_oth end as maristat_oth_description,
   count(*) n
from person
group by maristat_oth;


-- PREF_CONTACT & PREF_CONTACT_OTH --------------------------------------------------

select p.pref_contact as pref_contact_value,
   d.label as pref_contact_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.pref_contact = d.value
where type_name = 'contact_type_cl1'
group by p.pref_contact;

select pref_contact_oth as pref_contact_oth_value,
   case when pref_contact_oth = -7 then 'Not Applicable' else pref_contact_oth end as pref_contact_oth_description,
   count(*) n
from person
group by pref_contact_oth;


-- PLAN_MOVE, MOVE_INFO, NEW_ADDRESS_ID, WHEN_MOVE ----------------------------------

-- plan_move
select p.plan_move as plan_move_value,
   d.label as plan_move_description,
   count(p.id) as n
from person p left outer join
   xsd_enumeration_definition d on p.plan_move = d.value
where type_name = 'confirm_type_cl1'
group by p.plan_move;

-- move_info
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


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) n
from link_person_household
group by psu_id
order by count(*) desc;

-- psu_id  is not correct
select * from
link_person_household
where psu_id != 20000048;

-- PERSON_ID ------------------------------------------------------------------------

select person_id, count(*)
from link_person_household
group by person_id
order by count(*) desc;


-- HH_ID ---------------------------------------------------------------------

select hh_id, count(*)
from link_person_household
group by hh_id
order by count(*) desc;


-- PERSON_HH_ID ---------------------------------------------------------------------

select person_hh_id, count(*)
from link_person_household
group by person_hh_id
order by count(*) desc;


-- IS_ACTIVE ------------------------------------------------------------------------

select l.is_active as is_active_value,
   d.label as is_active_description,
   count(l.id) as n
from link_person_household l left outer join
   xsd_enumeration_definition d on l.is_active = d.value
where type_name = 'confirm_type_cl2'
group by l.is_active;


-- HH_RANK & HH_RANK_oth ------------------------------------------------------------

-- hh_rank

select l.hh_rank as hh_rank_value,
   d.label as hh_rank_description,
   count(l.id) as n
from link_person_household l left outer join
   xsd_enumeration_definition d on l.hh_rank = d.value
where type_name = 'communication_rank_cl1'
group by l.hh_rank;

-- hh_rank_oth

select hh_rank_oth as hh_rank_oth_value,
   case
       when hh_rank_oth = -7 then 'Not Applicable'
       else hh_rank_oth
   end as hh_rank_oth_description,
   count(*) n
from link_person_household
group by hh_rank_oth;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from link_person_household
group by transaction_type;

/*************************************************************************************
 * table: address
 *************************************************************************************/

show columns from address;
select count(*) n from address;


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


-- PERSON_ID ------------------------------------------------------------------------

select person_id, count(*) n from address group by person_id order by count(*) desc;


-- ADDRESS_ID -----------------------------------------------------------------------

select address_id, count(*) n from address group by address_id order by count(*) desc;


-- INSTITUTE_ID ---------------------------------------------------------------------

select institute_id, count(*) n from address group by institute_id order by count(*) desc;


-- PROVIDER_ID ---------------------------------------------------------------------

-- ISSUE: no provider code list provded
select provider_id, count(*) n from address group by provider_id order by count(*) desc;


-- DU_ID ----------------------------------------------------------------------------

select du_id, count(*) n from address group by du_id order by count(*) desc;


-- ADDRESS_RANK & ADDRESS_RANK_OTH --------------------------------------------------

-- address_rank

select a.address_rank as address_rank_value,
   d.label as address_rank_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_rank = d.value
where type_name = 'communication_rank_cl1'
group by a.address_rank;

-- address_rank_oth

select address_rank_oth as address_rank_oth_value,
   case
       when address_rank_oth = -7 then 'Not Applicable'
       else address_rank_oth
   end as address_rank_oth_description,
   count(*) n
from address
group by address_rank_oth;


-- ADDRESS_INFO_SOURCE & ADDRESS_INFO_SOURCE_OTH ------------------------------------

-- address_info_source

select a.address_info_source as address_info_source_value,
   d.label as address_info_source_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_info_source = d.value
where type_name = 'information_source_cl1'
group by a.address_info_source;

-- address_info_source_oth

select address_info_source_oth as address_info_source_oth_value,
   case
       when address_info_source_oth = -7 then 'Not Applicable'
       else address_info_source_oth
   end as address_info_source_oth_description,
   count(*) n
from address
group by address_info_source_oth;


-- ADDRESS_INFO_MODE & ADDRESS_INFO_MODE_OTH ----------------------------------------

-- address_info_mode

select a.address_info_mode as address_info_mode_value,
   d.label as address_info_mode_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_info_mode = d.value
where type_name = 'contact_type_cl1'
group by a.address_info_mode;

-- address_info_mode_oth

select address_info_mode_oth as address_info_mode_oth_value,
   case
       when address_info_mode_oth = -7 then 'Not Applicable'
       else address_info_mode_oth
   end as address_info_mode_oth_description,
   count(*) n
from address
group by address_info_mode_oth;


-- ADDRESS_INFO_DATE & ADDRESS_INFO_UPDATE ------------------------------------------

-- address_info_date

select address_info_date, count(*) n
from address
group by address_info_date
order by count(*) desc;

-- address_info_update

select address_info_update, count(*) n
from address
group by address_info_update
order by count(*) desc;


-- ADDRESS_START_DATE & ADDRESS_END_DATE --------------------------------------------

-- address_start_date

select address_start_date, count(*) n
from address
group by address_start_date
order by count(*) desc;

-- address_end_date

select address_end_date, count(*) n
from address
group by address_end_date
order by count(*) desc;


-- ADDRESS_TYPE & ADDRESS_TYPE_OTH --------------------------------------------------

-- address_type

select a.address_type as address_type_value,
   d.label as address_type_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_type = d.value
where type_name = 'address_category_cl1'
group by a.address_type;

-- address_type_oth

select address_type_oth as address_type_oth_value,
   case
       when address_type_oth = -7 then 'Not Applicable'
       else address_type_oth
   end as address_type_oth_description,
   count(*) n
from address
group by address_type_oth;


-- ADDRESS_DESCRIPTION & ADDRESS_DESCRIPTION_OTH ------------------------------------

-- address_description

select a.address_description as address_description_value,
   d.label as address_description_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.address_description = d.value
where type_name = 'residence_type_cl1'
group by a.address_description;

-- address_description_oth

select address_description_oth as address_description_oth_value,
   case
       when address_description_oth = -7 then 'Not Applicable'
       else address_description_oth
   end as address_description_oth_description,
   count(*) n
from address
group by address_description_oth;


-- ADDRESS_1, ADDRESS_2, UNIT, CITY, STATE, ZIP, ZIP4 -------------------------------

-- address_1

select address_1,
   case
       when address_1 = -1 then 'Refused'
       when address_1 = -2 then "Don't Know"
       when address_1 = -3 then 'Legitimate Skip'
       else ''
   end as comment,
   count(*) n
from address
group by address_1
order by count(*) desc;

-- address_2

-- ISSUE: what is address_2 = -7 & 8
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

-- unit

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
order by count(*) desc;


-- negative values
-- ISSUE: what is -2 and -3?

select *
from
   (
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
   ) a
where unit < 0;

-- city

select city, count(*) n
from address
group by city
order by count(*) desc;

-- ISSUE: what is -2, -3, -7

select city, count(*) n
from address
where city < 0
group by city
order by count(*) desc;

select city, count(*) n
from address
where city REGEXP '[[:digit:]]+'
group by city
order by count(*) desc;

-- state

select a.state as state_value,
   d.label as state_description,
   count(a.id) as n
from address a left outer join
   xsd_enumeration_definition d on a.state = d.value
where type_name = 'state_cl1'
group by a.state;

-- ZIP

select zip, count(*) n
from address
group by zip
order by count(*) desc;

-- odd zip
select zip, count(*) n
from address
where char_length(zip) < 5
group by zip
order by count(*) desc;

-- ZIP4

select zip4, count(*) n
from address
group by zip4
order by count(*) desc;

-- odd zip4
select zip, count(*) n
from address
where char_length(zip) < 4
group by zip
order by count(*) desc;


-- ADDRESS_COMMENT --------------------------------------------------------------------------

select address_comment, count(*) n
from address
group by address_comment
order by count(*) desc;

-- TRANSACTION TYPE -------------------------------------------------------------------------

select transaction_type, count(*) n
from address
group by transaction_type;

Simone Vuong
7:15 AM (59 minutes ago)
Reply
to me 


/*************************************************************************************
 * table: email
 *************************************************************************************/

show columns from email;
select count(*) n from email;


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


-- psu_id  is not correct
select * from email where psu_id != 20000048;


-- PERSON_ID ------------------------------------------------------------------------

select person_id, count(*) n from email group by person_id order by count(*) desc;


-- EMAIL_ID -----------------------------------------------------------------------

select email_id, count(*) n from email group by email_id order by count(*) desc;

-- ISSUE: why is email address not unique
select email, count(*) n from email group by email order by count(*) desc;


-- INSTITUTE_ID ---------------------------------------------------------------------

select institute_id, count(*) n from email group by institute_id order by count(*) desc;

-- PROVIDER_ID ---------------------------------------------------------------------

-- ISSUE: no provider code list provded
select provider_id, count(*) n from email group by provider_id order by count(*) desc;


-- EMAIL_RANK & EMAIL_RANK_OTH ------------------------------------------------------

-- email_rank

select e.email_rank as email_rank_value,
   d.label as email_rank_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_rank = d.value
where type_name = 'communication_rank_cl1'
group by e.email_rank;

-- email_rank_oth

select email_rank_oth as email_rank_oth_value,
   case
       when email_rank_oth = -7 then 'Not Applicable'
       else email_rank_oth
   end as email_rank_oth_description,
   count(*) n
from email
group by email_rank_oth;


-- EMAIL_INFO_SOURCE & EMAIL_INFO_SOURCE_OTH ----------------------------------------

-- email_info_source

select e.email_info_source as email_info_source_value,
   d.label as email_info_source_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_info_source = d.value
where type_name = 'information_source_cl1'
group by e.email_info_source;

-- email_info_source_oth

select email_info_source_oth as email_info_source_oth_value,
   case
       when email_info_source_oth = -7 then 'Not Applicable'
       else email_info_source_oth
   end as email_info_source_oth_description,
   count(*) n
from email
group by email_info_source_oth;


-- EMAIL_INFO_DATE & EMAIL_INFO_UPDATE ----------------------------------------------

-- email_info_date

select email_info_date, count(*) n
from email
group by email_info_date
order by count(*) desc;

-- email_info_update

select email_info_update, count(*) n
from email
group by email_info_update
order by count(*) desc;


-- EMAIL_TYPE & EMAIL_TYPE_OTH --------------------------------------------------

-- email_type

select e.email_type as email_type_value,
   d.label as email_type_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_type = d.value
where type_name = 'email_type_cl1'
group by e.email_type;

-- email_type_oth

select email_type_oth as email_type_oth_value,
   case
       when email_type_oth = -7 then 'Not Applicable'
       else email_type_oth
   end as email_type_oth_description,
   count(*) n
from email
group by email_type_oth;


-- EMAIL_SHARE ----------------------------------------------------------------------

select e.email_share as email_share_value,
   d.label as email_share_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_share = d.value
where type_name = 'confirm_type_cl1'
group by e.email_share;


-- EMAIL_ACTIVE ---------------------------------------------------------------------

select e.email_active as email_active_value,
   d.label as email_active_description,
   count(e.id) as n
from email e left outer join
   xsd_enumeration_definition d on e.email_share = d.value
where type_name = 'confirm_type_cl2'
group by e.email_active;


-- EMAIL_COMMENT --------------------------------------------------------------------

select email_comment as email_comment_value,
   case
       when email_comment = -7 then 'Not Applicable'
       else email_comment
   end as email_comment_description,
   count(*) n
from email
group by email_comment;

-- ISSUE: what is the difference between -7 versus NA?
select email_comment, count(*) n from email group by email_comment;


-- EMAIL_START_DATE & EMAIL_END_DATE ------------------------------------------------

-- email_start_date

select email_start_date, count(*) n
from email
group by email_start_date
order by count(*) desc;

-- email_end_date

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


-- psu_id  is not correct
select * from telephone where psu_id != 20000048;


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


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) from ppg_details group by psu_id;

select p.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(p.id) as n
from ppg_details p left outer join
   xsd_enumeration_definition d on p.psu_id = d.value
where type_name = 'psu_cl1'
group by p.psu_id;


-- psu_id  is not correct
select * from ppg_details where psu_id != 20000048;


-- PPG_DETAILS_ID -------------------------------------------------------------------

select ppg_details_id, count(*) n from ppg_details group by ppg_details_id order by count(*) desc;


-- P_ID -----------------------------------------------------------------------------

select p_id, count(*) n 
from ppg_details 
group by p_id 
order by count(*) desc;

-- PPG_PID_STATUS & PPG_FIRST -------------------------------------------------------

-- ppg_pid_status

select p.ppg_pid_status as ppg_pid_status_value,
   d.label as ppg_pid_status_description,
   count(p.id) as n
from ppg_details p left outer join
   xsd_enumeration_definition d on p.ppg_pid_status = d.value
where type_name = 'participant_status_cl1'
group by p.ppg_pid_status;

-- ppg_first

select p.ppg_first as ppg_first_value,
   d.label as ppg_first_description,
   count(p.id) as n
from ppg_details p left outer join
   xsd_enumeration_definition d on p.ppg_first = d.value
where type_name = 'ppg_status_cl1'
group by p.ppg_first;


-- ORIG_DUE_DATE, DUE_DATE_2, DUE_DATE_3 --------------------------------------------

-- orig_due_date

select orig_due_date, count(*) n
from ppg_details 
group by orig_due_date
order by orig_due_date;

-- due_date_2

select due_date_2, count(*) n
from ppg_details 
group by due_date_2
order by due_date_2;

-- due_date_3

select due_date_3, count(*) n
from ppg_details 
group by due_date_3
order by due_date_3;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from ppg_details 
group by transaction_type;


/*************************************************************************************
 * table: ppg_status_history
 *************************************************************************************/

show columns from ppg_status_history;
select count(*) n from ppg_status_history;


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

select ppg_history_id, count(*) n 
from ppg_status_history
group by ppg_history_id 
order by count(*) desc;


-- P_ID -----------------------------------------------------------------------------

select p_id, count(*) n 
from ppg_status_history
group by p_id 
order by count(*) desc;

-- PGG_STATUS & PGG_STATUS_DATE -----------------------------------------------------

-- ppg_status

select p.ppg_status as ppg_status_value,
   d.label as ppg_status_description,
   count(p.id) as n
from ppg_status_history p left outer join
   xsd_enumeration_definition d on p.ppg_status = d.value
where type_name = 'ppg_status_cl1'
group by p.ppg_status;

-- ppg_status_date

select ppg_status_date, count(*) n
from ppg_status_history
group by ppg_status_date;

-- PPG_INFO_SOURCE & PPG_INFO_SOURCE_OTH --------------------------------------------

-- ppg_info_source

select p.ppg_info_source as ppg_info_source_value,
   d.label as ppg_info_source_description,
   count(p.id) as n
from ppg_status_history p left outer join
   xsd_enumeration_definition d on p.ppg_info_source = d.value
where type_name = 'information_source_cl3'
group by p.ppg_info_source;

-- ppg_info_source_oth

select ppg_info_source_oth as ppg_info_source_oth_value,
   case
       when ppg_info_source_oth = -7 then 'Not Applicable'
       else ppg_info_source_oth
   end as ppg_info_source_oth_description,
   count(*) n
from ppg_status_history
group by ppg_info_source_oth;


-- PPG_INFO_MODE & PPG_INFO_MODE_OTH ------------------------------------------------

-- ppg_info_mode

select p.ppg_info_mode as ppg_info_mode_value,
   d.label as ppg_info_mode_description,
   count(p.id) as n
from ppg_status_history p left outer join
   xsd_enumeration_definition d on p.ppg_info_mode = d.value
where type_name = 'contact_type_cl1'
group by p.ppg_info_mode;

-- ppg_info_mode_oth

select ppg_info_mode_oth as ppg_info_mode_oth_value,
   case
       when ppg_info_mode_oth = -7 then 'Not Applicable'
       else ppg_info_mode_oth
   end as ppg_info_mode_oth_description,
   count(*) n
from ppg_status_history
group by ppg_info_mode_oth;


-- PPG_COMMENT ----------------------------------------------------------------------

select ppg_comment, count(*) n
from ppg_status_history
group by ppg_comment;


-- TRANSACTION TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from ppg_status_history
group by transaction_type;


/*************************************************************************************
 * CORRESPONDENCE & EVENTS
 *************************************************************************************/


/*************************************************************************************
 * table: link_contact
 *************************************************************************************/
 
show columns from link_contact;
select count(*) n from link_contact;


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


/*************************************************************************************
 * table: link_contact
 *************************************************************************************/

show columns from link_contact;
select count(*) n from link_contact;


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) from link_contact group by psu_id;

select x.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(x.id) as n
from link_contact x left outer join
   xsd_enumeration_definition d on x.psu_id = d.value
where type_name = 'psu_cl1'
group by x.psu_id;

-- psu_id  is not correct
select * from link_contact where psu_id != 20000048;


-- CONTACT_ID -----------------------------------------------------------------------

-- count
select *
from 
	(
		select contact_id, count(*) n
		from link_contact 
		group by contact_id 
	) l
where l.n > 1;
-- ISSUE: can the same contact_id have multiple rows here?


-- CONTACT_LINK_ID ------------------------------------------------------------------

-- count
select *
from 
	(
		select contact_link_id, count(*) n
		from link_contact 
		group by contact_link_id 
	) l
where l.n > 1;


-- EVENT_ID -------------------------------------------------------------------------

select *
from 
	(
		select event_id, count(*) n
		from link_contact 
		group by event_id 
	) l
where l.n > 1
order by event_id;

-- ISSUE: 173 null event_id


-- INSTRUMENT_ID --------------------------------------------------------------------

select *
from 
	(
		select instrument_id, count(*) n
		from link_contact 
		group by instrument_id 
	) l
where l.n > 1
order by instrument_id;
-- ISSUE: 168,027 null values


-- STAFF_ID -------------------------------------------------------------------------

select *
from 
	(
		select staff_id, count(*) n
		from link_contact 
		group by staff_id 
	) l
where l.n > 1
order by staff_id;


-- PERSON_ID ------------------------------------------------------------------------

select *
from 
	(
		select person_id, count(*) n
		from link_contact 
		group by person_id 
	) l
where l.n > 1
order by person_id;
-- ISSUE: 164,132 with person_id of -7

-- PRIVIDER_ID ----------------------------------------------------------------------

select *
from 
	(
		select provider_id, count(*) n
		from link_contact 
		group by provider_id 
	) l
where l.n > 1
order by provider_id;
-- ISSUE: provider code is either: null OR -7


-- TRANSACTION_TYPE -----------------------------------------------------------------

select transaction_type, count(*) n
from link_contact
group by transaction_type;


/*************************************************************************************
 * table: contact
 *************************************************************************************/


show columns from contact;
select count(*) n from contact;


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


-- count

select contact_id, count(*) n
from contact 
group by contact_id 
order by contact_id;
-- ISSUE: contact_id of -3 and -7


-- look for multiple counts
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
where type_name = 'contact_type_cl1'
group by x.contact_type;
-- ISSUE: "Missing in Error" (n=2)


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


-- PSU_ID ---------------------------------------------------------------------------

select psu_id, count(*) n from event group by psu_id;

select x.psu_id as psu_id_value,
   d.label as psu_id_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.psu_id = d.value
where type_name = 'psu_cl1'
group by x.psu_id;

-- psu_id  is not correct
select * from event where psu_id != 20000048;


-- PARTICIPANT_ID -------------------------------------------------------------

-- frequency
select participant_id, count(*) n from event group by participant_id;
-- ISSUE; why are there 27242 rows with no participant_ids?


-- EVENT_TYPE & EVENT_TYPE_OTH -------------------------------------


-- event_type

select x.event_type as event_type_value,
   d.label as psu_id_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_type = d.value
where type_name = 'event_type_cl1'
group by x.event_type;


-- event_type_oth

select event_type_oth, 
   case
       when event_type_oth = -7 then 'Not Applicable'
       else event_type_oth
   end as event_type_oth_description,
	count(*) n
from event
group by event_type_oth
order by event_type_oth;


-- EVENT_BREAKOFF -----------------------------------------------------------
-- EVENT_COMMENT -----------------------------------------------------------
-- EVENT_DISP -------------------------------------------------------------------
-- EVENT_DISP_CAT ------------------------------------------------------------
-- EVENT_END_DATE ----------------------------------------------------------
-- EVENT_END_TIME -----------------------------------------------------------
-- EVENT_ID ----------------------------------------------------------------------
-- EVENT_INCENT_CASH -----------------------------------------------------
-- EVENT_INCENT_NONCASH ----------------------------------------------
-- EVENT_INCENTIVE_TYPE -------------------------------------------------
-- EVENT_REPEAT_KEY -------------------------------------------------------
-- EVENT_START_DATE ------------------------------------------------------
-- EVENT_START_TIME -------------------------------------------------------

-- TRANSITION_TYPE ----------------------------------------------------------

select transaction_type, count(*) n
from event
group by transaction_type;



/*************************************************************************************
 * table: instrument
 *************************************************************************************/




/*
non_interview_rpt
non_interview_rpt_dutype
non_interview_rpt_noaccess
non_interview_rpt_refusal
non_interview_rpt_vacant

incident
incident_media
incident_unanticipated

participant_consent 
participant_vis_consent 
*/
