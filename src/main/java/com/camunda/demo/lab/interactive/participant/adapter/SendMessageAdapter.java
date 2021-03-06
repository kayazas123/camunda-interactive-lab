package com.camunda.demo.lab.interactive.participant.adapter;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@Named
public class SendMessageAdapter implements JavaDelegate {

  @Autowired
  private RestTemplate rest;

  @Override
  public void execute(DelegateExecution ctx) throws Exception {
    SendMessageRequestDto request = new SendMessageRequestDto();
    // TODO: implement
    rest.postForEntity(
        host + "/rest/engine/default/message/",
        request, 
        String.class); 
  }

}
