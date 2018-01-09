-- phpMyAdmin SQL Dump
-- version 4.7.3
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  mar. 09 jan. 2018 à 15:51
-- Version du serveur :  5.6.35
-- Version de PHP :  7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `PRODUITS`
--

-- --------------------------------------------------------

--
-- Structure de la table `Categorie`
--

CREATE TABLE `Categorie` (
  `codeCategorie` int(11) NOT NULL,
  `nomCategorie` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Categorie`
--

INSERT INTO `Categorie` (`codeCategorie`, `nomCategorie`) VALUES
(1, 'Alcool'),
(2, 'Fruits et légumes'),
(3, 'Surgelés'),
(4, 'Gateaux');

-- --------------------------------------------------------

--
-- Structure de la table `Produit`
--

CREATE TABLE `Produit` (
  `codeProduit` int(11) NOT NULL,
  `nomProduit` varchar(45) NOT NULL,
  `prixProduit` int(11) DEFAULT NULL,
  `codeCategorie` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `Produit`
--

INSERT INTO `Produit` (`codeProduit`, `nomProduit`, `prixProduit`, `codeCategorie`) VALUES
(1, 'VODKA', 11, 1),
(2, 'RHUM', 12, 1),
(3, 'TEQUILA', 14, 1),
(4, 'TOMATES', 3, 2),
(5, 'COURGETTES', 2, 2),
(6, 'ARTICHAUD', 5, 2),
(7, 'POISSON', 15, 3),
(8, 'VIANDE', 24, 3),
(9, 'PETIT BEURRE', 3, 4),
(10, 'CHOCOLATINE', 0, 4),
(11, 'GALETTE', 14, 4);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Categorie`
--
ALTER TABLE `Categorie`
  ADD PRIMARY KEY (`codeCategorie`);

--
-- Index pour la table `Produit`
--
ALTER TABLE `Produit`
  ADD PRIMARY KEY (`codeProduit`),
  ADD KEY `FK_codeCategorie` (`codeCategorie`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Produit`
--
ALTER TABLE `Produit`
  ADD CONSTRAINT `FK_codeCategorie` FOREIGN KEY (`codeCategorie`) REFERENCES `Categorie` (`codeCategorie`);
