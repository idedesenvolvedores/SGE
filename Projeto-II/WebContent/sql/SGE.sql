-- phpMyAdmin SQL Dump
-- version 4.5.0.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Tempo de geração: 23/03/2016 às 01:58
-- Versão do servidor: 10.0.17-MariaDB
-- Versão do PHP: 5.6.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `SGE`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `ATIVIDADE_ENSINO`
--

CREATE TABLE `ATIVIDADE_ENSINO` (
  `ID` int(11) NOT NULL,
  `DISCIPLINA` varchar(100) NOT NULL,
  `CURSO` varchar(100) NOT NULL,
  `CARGA_HORARIA` int(11) NOT NULL,
  `ID_PLANO_TRABALHO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ATIVIDADE_PEDAGOGICA`
--

CREATE TABLE `ATIVIDADE_PEDAGOGICA` (
  `ID` int(11) NOT NULL,
  `ATIVIDADE` varchar(200) DEFAULT NULL,
  `PORTARIA` varchar(20) DEFAULT NULL,
  `ID_PLANO_TRABALHO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `ENTREGA`
--

CREATE TABLE `ENTREGA` (
  `ID` int(11) NOT NULL,
  `NOME` varchar(100) DEFAULT NULL,
  `SIAPE` varchar(10) DEFAULT NULL,
  `SEMESTRE` varchar(50) DEFAULT NULL,
  `DATAE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `PESSOA`
--

CREATE TABLE `PESSOA` (
  `SIAPE` varchar(10) NOT NULL,
  `NOME` varchar(60) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `TELEFONE` varchar(100) DEFAULT NULL,
  `CAMPUS` varchar(50) DEFAULT NULL,
  `REG_TRABALHO` varchar(10) DEFAULT NULL,
  `AREA` varchar(50) DEFAULT NULL,
  `CLASSE` varchar(50) DEFAULT NULL,
  `DIRETORIA` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `PESSOA`
--

INSERT INTO `PESSOA` (`SIAPE`, `NOME`, `EMAIL`, `TELEFONE`, `CAMPUS`, `REG_TRABALHO`, `AREA`, `CLASSE`, `DIRETORIA`) VALUES
('123', 'Admin', '', NULL, NULL, NULL, NULL, NULL, NULL),
('222', 'nilson', 'njr146@oi.com.br', NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estrutura para tabela `PLANO_TRABALHO`
--

CREATE TABLE `PLANO_TRABALHO` (
  `ID` int(11) NOT NULL,
  `ATIVIDADE_APOIO` varchar(300) DEFAULT NULL,
  `ATIVIDADE_PESQUISA` varchar(300) DEFAULT NULL,
  `ATIVIDADE_EXTENSAO` varchar(300) DEFAULT NULL,
  `ID_USUARIO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura para tabela `TIPO_USUARIO`
--

CREATE TABLE `TIPO_USUARIO` (
  `ID` int(11) NOT NULL,
  `DESCRICAO` varchar(13) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `TIPO_USUARIO`
--

INSERT INTO `TIPO_USUARIO` (`ID`, `DESCRICAO`) VALUES
(1, 'ADMIN'),
(2, 'PROFESSOR');

-- --------------------------------------------------------

--
-- Estrutura para tabela `USUARIO`
--

CREATE TABLE `USUARIO` (
  `ID` int(11) NOT NULL,
  `SIAPEFK` varchar(10) NOT NULL,
  `SENHA` varchar(60) NOT NULL,
  `ID_TIPO_USUARIO` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Fazendo dump de dados para tabela `USUARIO`
--

INSERT INTO `USUARIO` (`ID`, `SIAPEFK`, `SENHA`, `ID_TIPO_USUARIO`) VALUES
(1, '123', '202cb962ac59075b964b07152d234b70', 1),
(2, '222', 'd9b1d7db4cd6e70935368a1efb10e377', 2);

--
-- Índices de tabelas apagadas
--

--
-- Índices de tabela `ATIVIDADE_ENSINO`
--
ALTER TABLE `ATIVIDADE_ENSINO`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PLANO_TRABALHO` (`ID_PLANO_TRABALHO`);

--
-- Índices de tabela `ATIVIDADE_PEDAGOGICA`
--
ALTER TABLE `ATIVIDADE_PEDAGOGICA`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_PLANO_TRABALHO` (`ID_PLANO_TRABALHO`);

--
-- Índices de tabela `ENTREGA`
--
ALTER TABLE `ENTREGA`
  ADD PRIMARY KEY (`ID`);

--
-- Índices de tabela `PESSOA`
--
ALTER TABLE `PESSOA`
  ADD PRIMARY KEY (`SIAPE`);

--
-- Índices de tabela `PLANO_TRABALHO`
--
ALTER TABLE `PLANO_TRABALHO`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_USUARIO` (`ID_USUARIO`);

--
-- Índices de tabela `TIPO_USUARIO`
--
ALTER TABLE `TIPO_USUARIO`
  ADD PRIMARY KEY (`ID`);

--
-- Índices de tabela `USUARIO`
--
ALTER TABLE `USUARIO`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_TIPO_USUARIO` (`ID_TIPO_USUARIO`),
  ADD KEY `SIAPEFK` (`SIAPEFK`);

--
-- AUTO_INCREMENT de tabelas apagadas
--

--
-- AUTO_INCREMENT de tabela `ATIVIDADE_ENSINO`
--
ALTER TABLE `ATIVIDADE_ENSINO`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `ATIVIDADE_PEDAGOGICA`
--
ALTER TABLE `ATIVIDADE_PEDAGOGICA`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `ENTREGA`
--
ALTER TABLE `ENTREGA`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `PLANO_TRABALHO`
--
ALTER TABLE `PLANO_TRABALHO`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de tabela `TIPO_USUARIO`
--
ALTER TABLE `TIPO_USUARIO`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de tabela `USUARIO`
--
ALTER TABLE `USUARIO`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Restrições para dumps de tabelas
--

--
-- Restrições para tabelas `ATIVIDADE_ENSINO`
--
ALTER TABLE `ATIVIDADE_ENSINO`
  ADD CONSTRAINT `ATIVIDADE_ENSINO_ibfk_1` FOREIGN KEY (`ID_PLANO_TRABALHO`) REFERENCES `PLANO_TRABALHO` (`ID`);

--
-- Restrições para tabelas `ATIVIDADE_PEDAGOGICA`
--
ALTER TABLE `ATIVIDADE_PEDAGOGICA`
  ADD CONSTRAINT `ATIVIDADE_PEDAGOGICA_ibfk_1` FOREIGN KEY (`ID_PLANO_TRABALHO`) REFERENCES `PLANO_TRABALHO` (`ID`);

--
-- Restrições para tabelas `PLANO_TRABALHO`
--
ALTER TABLE `PLANO_TRABALHO`
  ADD CONSTRAINT `PLANO_TRABALHO_ibfk_1` FOREIGN KEY (`ID_USUARIO`) REFERENCES `USUARIO` (`ID`);

--
-- Restrições para tabelas `USUARIO`
--
ALTER TABLE `USUARIO`
  ADD CONSTRAINT `USUARIO_ibfk_1` FOREIGN KEY (`ID_TIPO_USUARIO`) REFERENCES `TIPO_USUARIO` (`ID`),
  ADD CONSTRAINT `USUARIO_ibfk_2` FOREIGN KEY (`SIAPEFK`) REFERENCES `PESSOA` (`SIAPE`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
