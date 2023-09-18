package com.singhakxhay.passwordgenerator.service;

import com.singhakxhay.passwordgenerator.utils.PasswordGeneratorUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PasswordServiceImpl implements PasswordService {
  @Override
  public String generatePassword(int length) {
    log.info("[PasswordServiceImpl: generatePassword] - START");

    var password = PasswordGeneratorUtils.generatePassword(length);

    log.info("[PasswordServiceImpl: generatePassword] - END");

    return password;
  }
}
