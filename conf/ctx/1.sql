# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `employee` (
  `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` VARCHAR(254) NOT NULL,
  `address` VARCHAR(254) NOT NULL,
  `date_of_birth` DATETIME,
  `joining_date` DATETIME NOT NULL,
  `designation` VARCHAR(254)
);


# --- !Downs

drop table if exists `Employee`;
