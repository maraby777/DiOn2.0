SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Mealtime`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Mealtime` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Mealtime` (
  `idMealtime` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`idMealtime`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`GroupFood`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`GroupFood` ;

CREATE TABLE IF NOT EXISTS `mydb`.`GroupFood` (
  `idGroupFood` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`idGroupFood`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Food`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Food` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Food` (
  `idFood` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `kcal` INT NULL,
  `proteins` INT NULL,
  `fat` INT NULL,
  `carbohydrates` INT NULL,
  `comments` VARCHAR(200) NULL,
  `GroupFood_idGroupFood` INT NOT NULL,
  `isComplex` TINYINT(1) NULL,
  PRIMARY KEY (`idFood`),
  INDEX `fk_Food_GroupFood1_idx` (`GroupFood_idGroupFood` ASC),
  CONSTRAINT `fk_Food_GroupFood1`
    FOREIGN KEY (`GroupFood_idGroupFood`)
    REFERENCES `mydb`.`GroupFood` (`idGroupFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`User`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`User` ;

CREATE TABLE IF NOT EXISTS `mydb`.`User` (
  `idUser` INT NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(45) NULL,
  `name` VARCHAR(45) NULL,
  `hashString` VARCHAR(250) NULL,
  PRIMARY KEY (`idUser`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Diares`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Diares` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Diares` (
  `idDiares` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `time` TIME NULL,
  `date` DATE NULL,
  `weight` DECIMAL(3,2) NULL,
  `User_idUser` INT NOT NULL,
  `Food_idFood` INT NOT NULL,
  `Mealtime_idMealtime` INT NOT NULL,
  PRIMARY KEY (`idDiares`),
  INDEX `fk_Diares_User1_idx` (`User_idUser` ASC),
  INDEX `fk_Diares_Food1_idx` (`Food_idFood` ASC),
  INDEX `fk_Diares_Mealtime1_idx` (`Mealtime_idMealtime` ASC),
  CONSTRAINT `fk_Diares_User1`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `mydb`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Diares_Food1`
    FOREIGN KEY (`Food_idFood`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Diares_Mealtime1`
    FOREIGN KEY (`Mealtime_idMealtime`)
    REFERENCES `mydb`.`Mealtime` (`idMealtime`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`diares_weight`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`diares_weight` ;

CREATE TABLE IF NOT EXISTS `mydb`.`diares_weight` (
  `iddiares_weight` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NULL,
  `weght` DECIMAL(3,2) NULL,
  `diares_weightcol` VARCHAR(45) NULL,
  `User_idUser` INT NOT NULL,
  PRIMARY KEY (`iddiares_weight`),
  INDEX `fk_diares_weight_User1_idx` (`User_idUser` ASC),
  CONSTRAINT `fk_diares_weight_User1`
    FOREIGN KEY (`User_idUser`)
    REFERENCES `mydb`.`User` (`idUser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Food_has_Food`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Food_has_Food` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Food_has_Food` (
  `Food_idFood` INT NOT NULL,
  `Food_idFood2` INT NOT NULL,
  `Food_idFood3` INT NULL,
  `Food_idFood4` INT NULL,
  `Food_idFood5` INT NULL,
  `Food_idFood6` INT NULL,
  `Food_idFood7` INT NULL,
  `Food_idFood8` INT NULL,
  `Food_idFood9` INT NULL,
  `Food_idFood10` INT NULL,
  `Food_idFood11` INT NULL,
  `Food_idFood12` INT NULL,
  `Food_idFood13` INT NULL,
  `Food_idFood14` INT NULL,
  `weightFood2` INT NULL,
  `weightFood3` INT NULL,
  `weightFood4` INT NULL,
  `weightFood5` INT NULL,
  `weightFood6` INT NULL,
  `weightFood7` INT NULL,
  `weightFood8` INT NULL,
  `weightFood9` INT NULL,
  `weightFood10` INT NULL,
  `weightFood11` INT NULL,
  `weightFood12` INT NULL,
  `weightFood13` INT NULL,
  `weightFood14` INT NULL,
  PRIMARY KEY (`Food_idFood`),
  INDEX `fk_Food_has_Food_Food1_idx` (`Food_idFood` ASC),
  INDEX `fk_Food_has_Food_Food3_idx` (`Food_idFood2` ASC),
  INDEX `fk_Food_has_Food_Food4_idx` (`Food_idFood3` ASC),
  INDEX `fk_Food_has_Food_Food5_idx` (`Food_idFood4` ASC),
  INDEX `fk_Food_has_Food_Food6_idx` (`Food_idFood5` ASC),
  INDEX `fk_Food_has_Food_Food7_idx` (`Food_idFood6` ASC),
  INDEX `fk_Food_has_Food_Food8_idx` (`Food_idFood7` ASC),
  INDEX `fk_Food_has_Food_Food9_idx` (`Food_idFood8` ASC),
  INDEX `fk_Food_has_Food_Food10_idx` (`Food_idFood9` ASC),
  INDEX `fk_Food_has_Food_Food11_idx` (`Food_idFood10` ASC),
  INDEX `fk_Food_has_Food_Food12_idx` (`Food_idFood11` ASC),
  INDEX `fk_Food_has_Food_Food13_idx` (`Food_idFood12` ASC),
  INDEX `fk_Food_has_Food_Food14_idx` (`Food_idFood13` ASC),
  INDEX `fk_Food_has_Food_Food15_idx` (`Food_idFood14` ASC),
  CONSTRAINT `fk_Food_has_Food_Food1`
    FOREIGN KEY (`Food_idFood`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food3`
    FOREIGN KEY (`Food_idFood2`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food4`
    FOREIGN KEY (`Food_idFood3`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food5`
    FOREIGN KEY (`Food_idFood4`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food6`
    FOREIGN KEY (`Food_idFood5`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food7`
    FOREIGN KEY (`Food_idFood6`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food8`
    FOREIGN KEY (`Food_idFood7`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food9`
    FOREIGN KEY (`Food_idFood8`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food10`
    FOREIGN KEY (`Food_idFood9`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food11`
    FOREIGN KEY (`Food_idFood10`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food12`
    FOREIGN KEY (`Food_idFood11`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food13`
    FOREIGN KEY (`Food_idFood12`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food14`
    FOREIGN KEY (`Food_idFood13`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Food_has_Food_Food15`
    FOREIGN KEY (`Food_idFood14`)
    REFERENCES `mydb`.`Food` (`idFood`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
