package org.creating.json;

public enum NULL_STATE {
	S0(001, 'a');

	int no;
	char nav;

	NULL_STATE(int no, char nav) {
		this.no = no;
		this.nav = nav;
	}
}
