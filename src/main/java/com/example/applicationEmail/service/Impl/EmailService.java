package com.example.applicationEmail.service.Impl;

public interface EmailService {
    void sendSimpleMailMessage(String name, String to , String token);
    void sendMineMessageWithAttachement(String name, String to , String token);
    void sendMineMessageWithEmbeddedImages(String name, String to , String token);
    void sendMineMessageWithEmbeddedFiles(String name, String to , String token);
    void sendHtmlEmail(String name, String to , String token);
    void sendHtmlEmailWithEmbeddedFiles(String name, String to , String token);

}
