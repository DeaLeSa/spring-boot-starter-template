package fr.dlesaout.springbootstartertemplate.service;

public interface MessageService {

    String getMessage(String code);

    String getMessage(String code, Object[] args);

}
