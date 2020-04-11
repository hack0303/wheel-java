package org.creating.json;

public enum STRING_STATE {
	S0(001, 'a');

	int no;
	char nav;

	STRING_STATE(int no, char nav) {
		this.no = no;
		this.nav = nav;
	}
}
