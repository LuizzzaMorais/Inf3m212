<?php

	include_once("pessoa.class.php");
	$nome = $_POST['nome'];
	$salario = $_POST['salario'];
	
	if($salario <= 1320){
	$inss = 7.5;
	}else if($salario >= 1321 && $salario <= 2571.29){
	$inss = 9;
	}else if($salario >= 2571.30 && $salario <= 3856.94){
	$inss = 12;
	}else{
	$inss = 14;
}

 $desconto = $salario * ($inss / 100);
 $liquido = $salario - $desconto;
 
	$a = new Pessoa();
	//Instancia a classe pessa
	$a ->setNome($nome);
	$a ->setSalario($salario);
	$a ->setDesconto($desconto);
	$a ->setLiquido($liquido);
	$a ->setInss($inss);
	//$a ->setNome($nome);
	//para para colocar o objeto
	
	echo "Nome: ".$a->getNome();
	echo "<br>";
	echo "Salario bruto: $".$a->getSalario();
	echo "<br>";
	echo "Desconto INSS: ".$a->getInss();
	echo "%<br>";
	echo 'Valor descontado: $'.$a->getDesconto();
	echo "<br>";
	echo "Salario liquido: $".$a->getLiquido();
	echo "<br>";

echo"<br>$nome, seu salário bruto é de $$salario, isso quer dizer que o desconto do INSS sobre ele é de $inss%.<br>Isso resulta em um salario liquido de $$liquido com o desconto de $$desconto";
	

?>