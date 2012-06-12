USE ncs_mdes_prod;


ALTER TABLE address ADD INDEX `ix_du_id` (`du_id` ASC) ;

ALTER TABLE contact ADD INDEX `iix_contact_id` (`contact_id` ASC) ;

ALTER TABLE event ADD INDEX `ix_psu_id` (`psu_id` ASC) ;
ALTER TABLE event ADD INDEX `ix_event_id` (`event_id` ASC) ;

ALTER TABLE instrument ADD INDEX `ix_instrument_id` (`instrument_id` ASC) ;

ALTER TABLE link_contact ADD INDEX `ix_instrument_id` (`instrument_id` ASC) ;
ALTER TABLE link_contact ADD INDEX `ix_contact_id` (`contact_id` ASC) ;
ALTER TABLE link_contact ADD INDEX `ix_event_id` (`event_id` ASC) ;



ALTER TABLE link_household_dwelling ADD INDEX `ix_psu_id` (`psu_id` ASC) ;
ALTER TABLE link_household_dwelling ADD INDEX `ix_du_id` (`du_id` ASC) ;

ALTER TABLE non_interview_rpt ADD INDEX `iix_contact_id` (`contact_id` ASC) ;
ALTER TABLE non_interview_rpt ADD INDEX `ix_du_id` (`du_id` ASC) ;


ALTER TABLE participant ADD INDEX idx_participant_p_type(p_type);
ALTER TABLE participant ADD INDEX idx_participant_p_type_p_type_oth(p_type, p_type_oth);

