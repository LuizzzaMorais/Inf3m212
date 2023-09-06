<?php

	include_once("nota.class.php");
	$nome = $_POST['nome'];
	$idade = $_POST['idade'];
	$n1 = $_POST['n1'];
	$n2 = $_POST['n2'];
	$n3 = $_POST['n3'];
	$n4 = $_POST['n4']; 
	
	$media = (n1+n2+n3+n4)/4;
	
	if($media <= 7 && $media <=10){
	$situ = 'aprovado';
	}else if($media <= 6 $$ $media => 5){
	$situ = "recuperação";
	}else if($media < 5){
	$situ = "reprovado";
}
 
	$a = new Aluno();
	//Instancia a classe pessa
	$a ->setNome($nome);
	$a ->setIdade($idade);
	$a ->setN1($n1);
	$a ->setN2($n2);
	$a ->setN3($n3);
	$a ->setN4($n4);
	$a ->setMedia($media);
	$a ->setSitu($situ);
	//$a ->setNome($nome);
	//para para colocar o objeto
	
	echo "Nome: ".$a->getNome();
	echo "<br>";
	echo "Idade: $".$a->getIdade();
	echo "<br>";
	echo "Media: ".$a->getMedia();
	echo "%<br>";
	echo "Situação: $".$a->getSitu();
	echo "<br>";
	

?>