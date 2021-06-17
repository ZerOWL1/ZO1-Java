/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.http.networking;

import java.io.IOException;

/**
 *
 * @author Ryuu
 */
public class HttpDownloader {
    public static void main(String[] args) {
        String fileURL = "https://media1.vocaroo.com/mp3/16c3bY7BgkXb";
        String saveURL = "F:\\";
        try {
            HttpDownloadUtility.downloadFile(fileURL, saveURL);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
