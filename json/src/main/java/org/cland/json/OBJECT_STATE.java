package org.cland.json;

public enum OBJECT_STATE {
	S0(001, 'a');

	int no;
	char nav;

	OBJECT_STATE(int no, char nav) {
		this.no = no;
		this.nav = nav;
	}
}
