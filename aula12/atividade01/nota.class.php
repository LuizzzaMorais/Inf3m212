<?php
	
	class Pessoa{
		private $nome;
		private $idade;
		
		
	public function getNome(){
		return $this->nome;
	}	
	public	function getIdade(){
		return $this->idade;
	}
	public	function getN1(){
		return $this->n1;
	}
	public	function getN2(){
		return $this->n2;
	}
	public	function getN3(){
		return $this->n3;
	}
	public	function getN4(){
		return $this->n4;
	}
	public	function getMedia(){
		return $this->media;
	}
	public	function getSitu(){
		return $this->situ;
	}

	public function setNome($nome){
		$this->nome = $nome;
	}
	public function setIdade($idade){
		$this->idade = $idade;
	}
	public function setN1($n1){
		$this->n1 = $n1;
	}
	public function setN2($n2){
		$this->n2 = $n2;
	}
	public function setN3($n3){
		$this->n3 = $n3;
	}
	public function setN4($n4){
		$this->n4 = $n4;
	}
	public function setMedia($media){
		$this->media = $media;
	}
	public function setSitu($situ){
		$this->situ = $situ;
	}
	}
?>