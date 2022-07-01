package com.example.testjee;

import metier.Utilisateur;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Employe", value = "/employe")
public class Employe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Utilisateur premier = new Utilisateur();
        premier.setNom("Abakar");
        premier.setPrenom("Abbas");
        premier.setTel("00221773426754");
        Utilisateur deuxieme = new Utilisateur();
        deuxieme.setNom("Abakar");
        deuxieme.setPrenom("Abbas");
        deuxieme.setTel("00221773426754");
        Utilisateur troisieme = new Utilisateur();
        troisieme.setNom("Abakar");
        troisieme.setPrenom("Abbas");
        troisieme.setTel("00221773426754");
        Utilisateur qutrieme = new Utilisateur();
        qutrieme.setNom("Abakar");
        qutrieme.setPrenom("Abbas");
        qutrieme.setTel("00221773426754");
        Utilisateur cinq = new Utilisateur();
        cinq.setNom("Abakar");
        cinq.setPrenom("Abbas");
        cinq.setTel("00221773426754");
        Utilisateur six = new Utilisateur();
        six.setNom("Abakar");
        six.setPrenom("Abbas");
        six.setTel("00221773426754");
        Utilisateur sept = new Utilisateur();
        sept.setNom("Abakar");
        sept.setPrenom("Abbas");
        sept.setTel("00221773426754");
        Utilisateur huit = new Utilisateur();
        huit.setNom("Abakar");
        huit.setPrenom("Abbas");
        huit.setTel("00221773426754");

        request.setAttribute("un", premier);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
