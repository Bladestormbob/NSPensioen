-- noinspection SqlNoDataSourceInspectionForFile
-- noinspection SqlDialectInspectionForFile

CREATE SCHEMA `Pensioen` ;

CREATE TABLE `Pensioen`.`Machinist` (
  `medewerkernummer` INT NOT NULL,
  `medewerkernaam` VARCHAR(45) NOT NULL,
  `geboortedatum` DATE NOT NULL,
  `dienstjaren` INT NOT NULL,
  `stoomtrein` TINYINT NOT NULL,
  `aantalstoomjaren` INT NOT NULL,
  PRIMARY KEY (`medewerkernummer`));
  
INSERT INTO `Pensioen`.`Machinist` (`medewerkernummer`, `medewerkernaam`, `geboortedatum`, `dienstjaren`, `stoomtrein`, `aantalstoomjaren`) VALUES ('324', 'Rob de Nijs', '1942-12-26', '27', '1', '12');
INSERT INTO `Pensioen`.`Machinist` (`medewerkernummer`, `medewerkernaam`, `geboortedatum`, `dienstjaren`, `stoomtrein`, `aantalstoomjaren`) VALUES ('426', 'Fred Teeven', '1958-08-05', '2', '0', '0');
INSERT INTO `Pensioen`.`Machinist` (`medewerkernummer`, `medewerkernaam`, `geboortedatum`, `dienstjaren`, `stoomtrein`, `aantalstoomjaren`) VALUES ('578', 'Piet Paaltjens', '1949-05-03', '34', '1', '7');
INSERT INTO `Pensioen`.`Machinist` (`medewerkernummer`, `medewerkernaam`, `geboortedatum`, `dienstjaren`, `stoomtrein`, `aantalstoomjaren`) VALUES ('657', 'Nico Dijkshoorn', '1960-05-15', '12', '0', '0');
INSERT INTO `Pensioen`.`Machinist` (`medewerkernummer`, `medewerkernaam`, `geboortedatum`, `dienstjaren`, `stoomtrein`, `aantalstoomjaren`) VALUES ('368', 'Lee Towers', '1946-03-23', '32', '1', '25');

CREATE USER 'userPensioen'@'localhost' IDENTIFIED BY 'pwUserPensioen';
GRANT ALL PRIVILEGES ON Pensioen . * TO 'userPensioen'@'localhost';