CREATE TABLE `m_emp` (
  `emp_id` int(8) NOT NULL,
  `department_id` int(8) NOT NULL,
  `emp_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;

CREATE TABLE `m_department` (
  `department_id` int(8) NOT NULL,
  `department_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;