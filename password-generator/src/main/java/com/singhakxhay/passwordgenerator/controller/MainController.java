package com.singhakxhay.passwordgenerator.controller;

import com.singhakxhay.passwordgenerator.service.PasswordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passwords")
@RequiredArgsConstructor
@Slf4j
public class MainController {
  private final PasswordService passwordService;

  @GetMapping("/generate-random")
  public ResponseEntity<String> getRandomPassword(@RequestParam(defaultValue = "12") int length) {
    log.info("[MainController: getRandomPassword] - START");

    var password = passwordService.generatePassword(length);

    log.info("[MainController: getRandomPassword] - END");

    return ResponseEntity.ok(password);
  }
}
