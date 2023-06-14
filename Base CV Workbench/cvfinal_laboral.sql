CREATE DATABASE  IF NOT EXISTS `cvfinal` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cvfinal`;
-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: localhost    Database: cvfinal
-- ------------------------------------------------------
-- Server version	8.0.33-0ubuntu0.22.10.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `laboral`
--

DROP TABLE IF EXISTS `laboral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laboral` (
  `idtrabajo` bigint NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_fin` varchar(255) DEFAULT NULL,
  `fecha_inicio` varchar(255) DEFAULT NULL,
  `nombre_empresa` varchar(255) DEFAULT NULL,
  `nombre_trabajo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idtrabajo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboral`
--

LOCK TABLES `laboral` WRITE;
/*!40000 ALTER TABLE `laboral` DISABLE KEYS */;
INSERT INTO `laboral` VALUES (14,'#YoProgramo es un curso de la segunda etapa de Argentina Programa 4.0 en el que vas a adquirír las habilidades y herramientas para convertirte en un programador web full-stack junior.','Trabajando','Mayo 2023','ArgentinaPrograma.inti.gob.ar','Desarrollador Full Stack Jr'),(16,'Perfil flexible y adaptable a las necesidades de la gestión. Aplicación de mi experiencia en la Administración Pública, gestionando programas que administran proyectos orientados a la generación de nuevos empleos.','Mayo 2023','Abril 2000','Agencia Territorial','Analista Técnico'),(17,'Consectetur adipisicing elit. Praesentium magnam consectetur vel in deserunt aspernatur est reprehenderit sunt hic. Nulla tempora soluta ea et odio, unde doloremque repellendus iure, iste.','Diciembre 2014','Marzo 2012','Something.com','Otros trabajos'),(18,'Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aunque la frase no tiene sentido, tiene una larga historia. Durante varios siglos, los tipógrafos han utilizado esta frase para mostrar las características más distintivas de sus fuentes.','Marzo 2010','Junio 2010','designsomething.com','Graphic Designer'),(64,'Descripcion','Final','Inicio','Empresa 1','Cargo 1');
/*!40000 ALTER TABLE `laboral` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-14 20:12:41
