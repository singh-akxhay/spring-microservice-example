package com.singhakxhay.passwordgenerator.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Collections;
import java.util.stream.Collectors;

public class PasswordGeneratorUtils {
  public static String generatePassword(int length) {
    var rem = (length % 5);
    var k = (length / 5);
    var upperCaseLetters = RandomStringUtils.random(k + ((rem-- > 0) ? 1 : 0), 'A', 'Z', true, true);
    var lowerCaseLetters = RandomStringUtils.random(k + ((rem-- > 0) ? 1 : 0), 'a', 'z', true, true);
    var numbers = RandomStringUtils.randomNumeric(k + ((rem-- > 0) ? 1 : 0));
    var specialChar = RandomStringUtils.random(k + ((rem > 0) ? 1 : 0), '!', '/', false, false);
    var totalChars = RandomStringUtils.randomAlphanumeric(k);

    var combinedChars = upperCaseLetters.concat(lowerCaseLetters)
        .concat(numbers)
        .concat(specialChar)
        .concat(totalChars);

    var pwdChars = combinedChars.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.toList());

    Collections.shuffle(pwdChars);

    return pwdChars.stream()
        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
        .toString();
  }
}
