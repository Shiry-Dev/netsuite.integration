INSERT INTO collaborator (collaborator_id,employee,email,class,employee_level,supervisor_id,title,is_job_resource) VALUES (1,'John Doe','johndoe@example.com',1,5,100,'Senior Developer',true);
INSERT INTO skill (skill_id,description) VALUES (1,'Project Management');
INSERT INTO tag (tag_id,description) VALUES (1,'Leadership');
INSERT INTO allocation (allocation_id,collaborator_id,project,alt_name,project_task,full_name,start_date,end_date,number_hours,is_billable,is_overhead,unit,percent_of_time,allocation_type,is_active) VALUES (1,1,101,'Alt Project Name',1001,'John Doe','2024-01-01','2024-12-31',160,true,false,'HOURS',50,'HARD',true);
INSERT INTO collaborator_skill (collaborator_skill_id,collaborator_id,skill_id) VALUES (1,1,1);
INSERT INTO collaborator_tag (collaborator_tag_id,collaborator_id,tag_id) VALUES (1,1,1);
