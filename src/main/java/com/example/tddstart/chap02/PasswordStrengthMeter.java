package com.example.tddstart.chap02;

public class PasswordStrengthMeter {

	public PasswordStrength meter(String s) {
		if (s == null || s.isBlank()) {
			return PasswordStrength.INVALID;
		}
		boolean lengthEnough = s.length() >= 8;
		boolean containsNum = meetsContainingNumberCriteria(s);
		boolean containsUpp = meentsContainingUppercaseCriteria(s);

//		if (s.length() < 8) {
//			return PasswordStrength.NORMAL;
//		}
		if (lengthEnough && !containsNum && !containsUpp) {
			return PasswordStrength.WEAK;
		}
		if (!lengthEnough && containsNum && !containsUpp) {
			return PasswordStrength.WEAK;
		}
		if (!lengthEnough) {
			return PasswordStrength.NORMAL;
		}
		if (!containsNum) {
			return PasswordStrength.NORMAL;
		}
		if (!containsUpp) {
			return PasswordStrength.NORMAL;
		}
		return PasswordStrength.STRONG;
	}

	private boolean meetsContainingNumberCriteria(String s) {
		for (char ch : s.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				return true;
			}
		}
		return false;
	}

	private boolean meentsContainingUppercaseCriteria(String s) {
		for (char ch : s.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				return true;
			}
		}
		return false;
	}
}
