package org.creating.json;

public enum ARRAY_STATE {
	S0(001, 'a');

	int no;
	char nav;

	ARRAY_STATE(int no, char nav) {
		this.no = no;
		this.nav = nav;
	}
}
