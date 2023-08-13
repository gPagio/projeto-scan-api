package com.scanApio.user;

public class User {

	int idUser;
	String nameUser;
	int matriculaUser;
	String emailUser;
	String pwdsUser;
	int sectorUser;
	String folderDestUser;
	Boolean isActiveUser;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNomeUser() {
		return nameUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nameUser = nomeUser;
	}

	public int getMatriculaUser() {
		return matriculaUser;
	}

	public void setMatriculaUser(int matriculaUser) {
		this.matriculaUser = matriculaUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPwdsUser() {
		return pwdsUser;
	}

	public void setPwdsUser(String pwdsUser) {
		this.pwdsUser = pwdsUser;
	}

	public int getSetorUser() {
		return sectorUser;
	}

	public void setSetorUser(int setorUser) {
		this.sectorUser = setorUser;
	}

	public String getFolderDestUser() {
		return folderDestUser;
	}

	public void setFolderDestUser(String folderDestUser) {
		this.folderDestUser = folderDestUser;
	}

	public Boolean getIsActiveUser() {
		return isActiveUser;
	}

	public void setIsActiveUser(Boolean isActiveUser) {
		this.isActiveUser = isActiveUser;
	}

}