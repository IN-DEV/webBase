<?php 
/**
*generer par bff de in~dev
*
*/
	function bdd(){
		try{
		$pdo_options[PDO::ATTR_ERRMODE] =PDO::ERRMODE_EXCEPTION;
		$bdd= new PDO('mysql:host=localhost;dbname=forum','root','',$pdo_options);
		}
			catch (Exception $e){
				die('Erreur : '.$e->getMessage());
			}
			return $bdd;
	}
	
	function cookies( $nom, $value, $temps ){
		setcookie($nom, $value, $temps, '/');
	}
?>