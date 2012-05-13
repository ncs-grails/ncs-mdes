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
 *
 * 		PARTICIPANTS
 *
 * 		Person: 
 * 				link_person_participant
 * 				participant
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


-- psu_id is not correct
select * from event where psu_id != 20000048;


-- EVENT_ID -------------------------------------------------------------


-- frequency
select event_id, count(*) n from event group by event_id;


-- multiple event_ids
select * 
from
	(
		select event_id, count(*) n 
		from event 
		group by event_id
	) e
where e.n > 1 ;


-- PARTICIPANT_ID -------------------------------------------------------------


-- frequency
select participant_id, count(*) n from event group by participant_id;
-- ISSUE: why are there 27242 rows with no participant_ids?


-- EVENT_TYPE & EVENT_TYPE_OTH ------------------------------------------------


-- event code list

select value as event_type_value, 
	label as event_type_description
from xsd_enumeration_definition
where type_name = 'event_type_cl1'
order by value;


-- event_type

select x.event_type as event_type_value,
   d.label as event_type_description,
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


-- EVENT_REPEAT_KEY -----------------------------------------------------------

select event_repeat_key, count(*) n from event group by event_repeat_key;


-- EVENT_DISP & EVENT_DISP_CAT ------------------------------------------------


-- event_disp frequency
select event_disp, count(*) n from event group by event_disp;
-- ISSUE: where is the event_disp code?


-- event_disp_cat frequency
select x.event_disp_cat as event_disp_cat_value,
   d.label as event_disp_cat_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_disp_cat = d.value
where type_name = 'event_dspstn_cat_cl1'
group by x.event_disp_cat;


-- EVENT_START_DATE & EVENT_START_TIME ----------------------------------------

-- either event_start_date or event_start_time is null
select id, event_start_date, event_start_time
from event
where event_start_date is null
	 or event_start_time is null;


-- EVENT_END_DATE & EVENT_END_TIME --------------------------------------------

-- either event_end_date or event_end_time is null
select id, event_end_date, event_end_time
from event
where event_start_date is null
	 or event_start_time is null;


-- EVENT_BREAKOFF -------------------------------------------------------------

select event_breakoff, count(*) n from event group by event_breakoff;

select x.event_breakoff as event_breakoff_value,
   d.label as event_breakoff_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_breakoff = d.value
where type_name = 'confirm_type_cl1'
group by x.event_breakoff;


-- EVENT_INCENTIVE_TYPE, EVENT_INCENT_CASH & EVENT_INCENT_NONCASH -------------


-- event_incentive_type

select x.event_incentive_type as event_incentive_type_value,
   d.label as event_incentive_type_description,
   count(x.id) as n
from event x left outer join
   xsd_enumeration_definition d on x.event_incentive_type = d.value
where type_name = 'incentive_type_cl1'
group by x.event_incentive_type;


-- event_incent_cash

select event_incent_cash, count(*) n from event group by event_incent_cash;


-- event_incent_noncash
select event_incent_noncash, count(*) n from event group by event_incent_noncash;
-- ISSUE: what is code = -7


-- EVENT_COMMENT --------------------------------------------------------------

select event_comment, count(*) n from event group by event_comment;


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


-- psu_id is not correct
select * from non_interview_rpt where psu_id != 20000048;


-- NIR_ID ---------------------------------------------------------------------------


-- frequency
select nir_id, count(*) n from non_interview_rpt group by nir_id;
select nir_id, count(*) n from non_interview_rpt group by nir_id limit 40;


-- multiple nir_ids

select *
from
	(
		select nir_id, count(*) n 
		from non_interview_rpt 
		group by nir_id
	) r
where r.n > 1;


-- CONTACT_ID -----------------------------------------------------------------------

-- contact_id frequency
select contact_id, count(*) n from non_interview_rpt group by contact_id;


-- multiple contact_ids

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
select nir, count(*) n from non_interview_rpt group by nir order by count(*) desc;
-- TODO: nir by contact_id


-- DU_ID ----------------------------------------------------------------------------

-- du_id frequency
select du_id, count(*) n from non_interview_rpt group by du_id order by count(*) desc;
-- ISSUE: why are there 173 null du_id?


-- PERSON_ID ------------------------------------------------------------------------


-- person_id frequency
select person_id, count(*) n from non_interview_rpt group by person_id order by count(*) desc;
-- ISSUE: why are there 150,778 missing person_ids


-- NIR_VAC_INFO & NIR_VAC_INFO_OTH --------------------------------------------------


-- nir_vac_info code list
select *
from xsd_enumeration_definition 
where type_name = 'du_vacancy_info_source_cl1'
order by value;


-- nir_vac_info frequency

select x.nir_vac_info as nir_vac_info_value,
   d.label as nir_vac_info_description,
   count(x.id) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_vac_info = d.value
where type_name = 'du_vacancy_info_source_cl1'
group by x.nir_vac_info;


-- nir_vac_info_oth frequency

select nir_vac_info_oth, count(*) n from non_interview_rpt group by nir_vac_info_oth order by count(*) desc;


-- NIR_NOACCESS & NIR_NOACCESS_OTH --------------------------------------------------


-- nir_noaccess code list

select *
from xsd_enumeration_definition 
where type_name = 'no_access_descr_cl1'
order by value;


-- nir_noaccess frequency

select x.nir_noaccess as nir_noaccess_value,
   d.label as nir_noaccess_description,
   count(*) as n
from non_interview_rpt x left outer join
   xsd_enumeration_definition d on x.nir_noaccess = d.value
where type_name = 'no_access_descr_cl1'
group by x.nir_noaccess;


-- nir_noaccess_oth

select nir_noaccess_oth, count(*) n
from non_interview_rpt 
group by nir_noaccess_oth;


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

-- NOTE: no data


/*************************************************************************************
 * table: incident_media
 *************************************************************************************/


show columns from incident_media;
select count(*) n from incident_media;

-- NOTE: no data


/*************************************************************************************
 * table: incident_unanticipated
 *************************************************************************************/

show columns from incident_unanticipated;
select count(*) n from incident_unanticipated;

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
-- ISSUE: what does consent_language of -3 mean?


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
-- ISSUE: what is person_wthdrw_consent_id of -7


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
-- ISSUE: what is consent_comment = -3


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
-- ISSUE: why is there ssu_id = -7 (n=3)

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

-- ISSUE: why are all outreach_lang2 null, when outreach_lang1 suggust some outreach was language specific?


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

-- ISSUE: outreach_race2 is null, but outreach_race1 suggust some outreach was specific to a race


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
 * 				staff_cert_training
 * 				staff_language
 * 				
 * 		Weekly Staff Expense: 
 * 				staff_exp_data_cllctn_tasks, 
 * 				staff_exp_mngmnt_tasks, 
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

-- staff_id is null
select *
from staff 
where staff_id is null;


-- staff_id frequency
select staff_id, count(*) n
from staff 
group by staff_id
order by staff_id desc;


-- staff_id is not unique
select *
from ( select staff_id, count(*) n from staff  group by staff_id ) o
where o.n > 1;


-- STAFF_TYPE & STAFF_TYPE_OTH ------------------------------------------------------
-- (labor position)

-- staff_type code list (-5 = Oher, -4 = Missing in Error)
select * from xsd_enumeration_definition where type_name = 'study_staff_type_cl1' order by value;


-- staff_type frequency
select x.staff_type as staff_type_value,
   d.label as staff_type_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_type = d.value
where type_name = 'study_staff_type_cl1'
group by x.staff_type;


-- staff_type_oth frequency (-7 = NA)
select staff_type_oth, 	count(*) n from staff group by staff_type_oth order by staff_type_oth desc;


-- staff_id with no staff_type indicated
select staff_id, staff_type from staff where staff_type is null;


-- ANALYSIS: 

-- staff_id with study_type = Other and staff_type_oth provided
select x.staff_id, 
	x.staff_type as staff_type_value,
	d.label as staff_type_description, 
	staff_type_oth	 
from staff x left outer join
   xsd_enumeration_definition d on x.staff_type = d.value
where type_name = 'study_staff_type_cl1'
	and x.staff_type = -5;


-- staff_id with 'Missing in Error' study_type
select x.staff_id, 
	x.staff_type as staff_type_value,
	d.label as staff_type_description, 
	staff_type_oth	 
from staff x left outer join
   xsd_enumeration_definition d on x.staff_type = d.value
where type_name = 'study_staff_type_cl1'
	and x.staff_type < 0
;
-- ISSUE: 27 staff_ids with 'Missing in Error' staff_type


-- SUBCONTRACTOR --------------------------------------------------------------------


-- subcontractor code list
select *
from xsd_enumeration_definition 
where type_name = 'confirm_type_cl2'
order by value;


-- subcontractor frequency
select x.subcontractor as subcontractor_value,
   d.label as subcontractor_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.subcontractor = d.value
where type_name = 'confirm_type_cl2'
group by x.subcontractor;


-- STAFF_YOB ------------------------------------------------------------------------


-- staff_id frequency
select staff_yob, count(*) n
from staff 
group by staff_yob
order by staff_yob desc;


-- STAFF_AGE_RANGE ------------------------------------------------------------------


-- staff_age_range code list
select *
from xsd_enumeration_definition 
where type_name = 'age_range_cl1'
order by value;


-- staff_age_range frequency
select x.staff_age_range as staff_age_range_value,
   d.label as staff_age_range_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_age_range = d.value
where type_name = 'age_range_cl1'
group by x.staff_age_range;


-- STAFF_GENDER ---------------------------------------------------------------------


-- staff_gender code list
select *
from xsd_enumeration_definition 
where type_name = 'gender_cl1'
order by value;


-- staff_gender frequency
select x.staff_gender as staff_gender_value,
   d.label as staff_gender_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_gender = d.value
where type_name = 'gender_cl1'
group by x.staff_gender;


-- STAFF_RACE & STAFF_RACE_OTH ------------------------------------------------------


-- staff_race code list
select *
from xsd_enumeration_definition 
where type_name = 'race_cl1'
order by value;


-- staff_staff_race frequency
select x.staff_race as staff_race_value,
   d.label as staff_race_description,
   count(*) as n
from staff x left outer join
   xsd_enumeration_definition d on x.staff_race = d.value
where type_name = 'race_cl1'
group by x.staff_race;


-- staff_race_oth frequency
select staff_race_oth as staff_race_oth_value, 
	case
  	when staff_race_oth = -7 then 'Not Applicable'
    else staff_race_oth
	end as staff_race_oth_description,
	count(*) n
from staff 
group by staff_race_oth
order by staff_race_oth desc;


-- STAFF_ZIP ------------------------------------------------------------------------


select staff_zip as staff_zip_value, 
	case
  	when staff_zip = -7 then 'Not Applicable'
    else staff_zip
	end as staff_zip_description,
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


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_CERT_LIST_ID ---------------------------------------------------------------

select staff_cert_list_id, count(*) n
from staff_cert_training
group by staff_cert_list_id
order by staff_cert_list_id desc;


-- STAFF_ID -------------------------------------------------------------------------


select staff_id, count(*) n
from staff_cert_training
group by staff_id
order by staff_id desc;


-- CERT_TRAIN_TYPE ------------------------------------------------------------------


-- cert_train_type code list
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


-- CERT_DATE ------------------------------------------------------------------------

select cert_date, count(*) n
from staff_cert_training
group by cert_date
order by cert_date desc;


-- STAFF_BGCHECK_LVL ----------------------------------------------------------------


-- staff_bgcheck_lvl code list
select *
from xsd_enumeration_definition 
where type_name = 'background_chck_lvl_cl1'
order by value;


-- cert_train_type frequency
select x.staff_bgcheck_lvl as staff_bgcheck_lvl_value,
   d.label as staff_bgcheck_lvl_description,
   count(*) as n
from staff_cert_training x left outer join
   xsd_enumeration_definition d on x.staff_bgcheck_lvl = d.value
where type_name = 'background_chck_lvl_cl1'
group by x.staff_bgcheck_lvl;


-- CERT_TYPE_FREQUENCY --------------------------------------------------------------

select cert_type_frequency, count(*) n
from staff_cert_training
group by cert_type_frequency
order by cert_type_frequency desc;


-- CERT_TYPE_EXP_DATE ---------------------------------------------------------------

select cert_type_exp_date, count(*) n
from staff_cert_training
group by cert_type_exp_date
order by cert_type_exp_date desc;


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


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_LANGUAGE_ID ----------------------------------------------------------------

select staff_language_id, count(*) n
from staff_language
group by staff_language_id
order by staff_language_id desc;


-- STAFF_ID -------------------------------------------------------------------------

select staff_id, count(*) n
from staff_language
group by staff_id
order by staff_id desc;


-- STAFF_LANG -----------------------------------------------------------------------


-- staff_lang code list
select *
from xsd_enumeration_definition 
where type_name = 'language_cl2'
order by value;


-- staff_lang frequency
select x.staff_lang as staff_lang_value,
   d.label as staff_lang_description,
   count(*) as n
from staff_language x left outer join
   xsd_enumeration_definition d on x.staff_lang = d.value
where type_name = 'language_cl2'
group by x.staff_lang;


-- STAFF_LANG_OTH -------------------------------------------------------------------

select staff_lang_oth, count(*) n
from staff_language
group by staff_lang_oth
order by staff_lang_oth desc;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency



/*************************************************************************************
 * table: staff_exp_data_cllctn_tasks
 *************************************************************************************/

show columns from staff_exp_data_cllctn_tasks;
select count(*) n from staff_exp_data_cllctn_tasks;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_EXP_DATA_COLL_TASK_ID ------------------------------------------------------


select staff_exp_data_coll_task_id, count(*) n
from staff_exp_data_cllctn_tasks
group by staff_exp_data_coll_task_id
order by staff_exp_data_coll_task_id desc;


-- STAFF_WEEKLY_EXPENSE_ID ----------------------------------------------------------

select staff_weekly_expense_id, count(*) n
from staff_exp_data_cllctn_tasks
group by staff_weekly_expense_id
order by staff_weekly_expense_id desc;


-- DATA_COLL_TASK_TYPE --------------------------------------------------------------


-- data_coll_task_type code list
select *
from xsd_enumeration_definition 
where type_name = 'study_data_cllctn_tsk_type_cl1'
order by value;


-- data_coll_task_type frequency
select x.data_coll_task_type as data_coll_task_type_value,
   d.label as data_coll_task_type_description,
   count(*) as n
from staff_exp_data_cllctn_tasks x left outer join
   xsd_enumeration_definition d on x.data_coll_task_type = d.value
where type_name = 'study_data_cllctn_tsk_type_cl1'
group by x.data_coll_task_type;


-- DATA_COLL_TASK_TYPE_OTH ----------------------------------------------------------

select data_coll_task_type_oth, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_task_type_oth
order by data_coll_task_type_oth desc;


-- DATA_COLL_TASKS_HRS --------------------------------------------------------------

select data_coll_tasks_hrs, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_tasks_hrs
order by data_coll_tasks_hrs desc;


-- DATA_COLL_TASK_CASES -------------------------------------------------------------

select data_coll_task_cases, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_task_cases
order by data_coll_task_cases desc;


-- DATA_COLL_TRANSMIT ---------------------------------------------------------------

select data_coll_transmit, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_transmit
order by data_coll_transmit desc;


-- DATA_COLL_TASK_COMMENT -----------------------------------------------------------

select data_coll_task_comment, count(*) n
from staff_exp_data_cllctn_tasks
group by data_coll_task_comment
order by data_coll_task_comment desc;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 

/*************************************************************************************
 * table: staff_exp_mngmnt_tasks
 *************************************************************************************/


show columns from staff_exp_mngmnt_tasks;
select count(*) n from staff_exp_mngmnt_tasks;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- STAFF_EXP_MGMT_TASK_ID -----------------------------------------------------------

select staff_exp_mgmt_task_id, count(*) n
from staff_exp_mngmnt_tasks
group by staff_exp_mgmt_task_id
order by staff_exp_mgmt_task_id desc;


-- STAFF_WEEKLY_EXPENSE_ID ----------------------------------------------------------

select staff_weekly_expense_id, count(*) n
from staff_exp_mngmnt_tasks
group by staff_weekly_expense_id
order by staff_weekly_expense_id desc;


-- MGMT_TASK_TYPE -------------------------------------------------------------------


-- mgmt_task_type code list
select *
from xsd_enumeration_definition 
where type_name = 'study_mngmnt_tsk_type_cl1'
order by value;


-- mgmt_task_type frequency
select x.mgmt_task_type as mgmt_task_type_value,
   d.label as mgmt_task_type_description,
   count(*) as n
from staff_exp_mngmnt_tasks x left outer join
   xsd_enumeration_definition d on x.mgmt_task_type = d.value
where type_name = 'study_mngmnt_tsk_type_cl1'
group by x.mgmt_task_type;


-- MGMT_TASK_TYPE_OTH ---------------------------------------------------------------

select mgmt_task_type_oth, count(*) n
from staff_exp_mngmnt_tasks
group by mgmt_task_type_oth
order by mgmt_task_type_oth desc;


-- MGMT_TASK_HRS --------------------------------------------------------------------

select mgmt_task_hrs, count(*) n
from staff_exp_mngmnt_tasks
group by mgmt_task_hrs
order by mgmt_task_hrs desc;


-- MGMT_TASK_COMMENT ----------------------------------------------------------------

select mgmt_task_comment, count(*) n
from staff_exp_mngmnt_tasks
group by mgmt_task_comment
order by mgmt_task_comment desc;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
 

/*************************************************************************************
 * table: staff_weekly_expense
 *************************************************************************************/


show columns from staff_weekly_expense;
select count(*) n from staff_weekly_expense;


-- PSU_ID ---------------------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency


-- WEEKLY_EXP_ID --------------------------------------------------------------------

select WEEKLY_EXP_ID, count(*) n
from staff_weekly_expense
group by WEEKLY_EXP_ID
order by WEEKLY_EXP_ID desc;


-- STAFF_ID -------------------------------------------------------------------------

select STAFF_ID, count(*) n
from staff_weekly_expense
group by STAFF_ID
order by STAFF_ID desc;


-- WEEK_START_DATE ------------------------------------------------------------------

select WEEK_START_DATE, count(*) n
from staff_weekly_expense
group by WEEK_START_DATE
order by WEEK_START_DATE desc;


-- STAFF_PAY ------------------------------------------------------------------------

select STAFF_PAY, count(*) n
from staff_weekly_expense
group by STAFF_PAY
order by STAFF_PAY desc;


-- STAFF_HOURS ----------------------------------------------------------------------

select STAFF_HOURS, count(*) n
from staff_weekly_expense
group by STAFF_HOURS
order by STAFF_HOURS desc;


-- STAFF_EXPENSES -------------------------------------------------------------------

select STAFF_EXPENSES, count(*) n
from staff_weekly_expense
group by STAFF_EXPENSES
order by STAFF_EXPENSES desc;


-- STAFF_MILES ----------------------------------------------------------------------

select STAFF_MILES, count(*) n
from staff_weekly_expense
group by STAFF_MILES
order by STAFF_MILES desc;


-- WEEKLY_EXPENSES_COMMENT ----------------------------------------------------------

select WEEKLY_EXPENSES_COMMENT, count(*) n
from staff_weekly_expense
group by WEEKLY_EXPENSES_COMMENT
order by WEEKLY_EXPENSES_COMMENT desc;


-- TRANSACTION_TYPE -----------------------------------------------------------------
-- TODO (LOW-PRIORITY): get frequency
