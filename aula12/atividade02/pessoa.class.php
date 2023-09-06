<?php
	
	class Pessoa{
		private $nome;
		private $salario;
		
		
	public function getNome(){
		return $this->nome;
	}	
	public	function getSalario(){
		return $this->salario;
	}
	public	function getLiquido(){
		return $this->liquido;
	}
	public	function getDesconto(){
		return $this->desconto;
	}
	public	function getInss(){
		return $this->inss;
	}

	public function setNome($nome){
		$this->nome = $nome;
	}
	public function setSalario($salario){
		$this->salario = $salario;
	}
	public function setLiquido($liquido){
		$this->liquido = $liquido;
	}
	public function setDesconto($desconto){
		$this->desconto = $desconto;
	}
	public function setInss($inss){
		$this->inss = $inss;
	}
	}
?>