<?php

 //Mendefinisikan Konstanta
$server = "localhost";
$username = "id13879448_root";
$password = "4%*@zPI|*kf5((^5";
$dbname = "id13879448_jsonharddsik";

 //membuat koneksi dengan database
 $conn = new mysqli($server,$username,$password,$dbname);
 
 //check koneksi
 if($conn->connect_error){
 	die("Koneksi gagal/Failed ".$coon->connect_error);
 }
 $sql="SELECT * FROM t_menu";
 $result=$conn->query($sql);
 $data=array();
 
 if($result->num_rows>0){
 	while ($row=$result->fetch_assoc()){
		$data[]=$row;
	}
 }else{
		echo"data kosong";
	}
 	echo json_encode($data);
	$conn->close();
 ?>
