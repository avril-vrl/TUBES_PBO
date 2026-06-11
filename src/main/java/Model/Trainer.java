/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class Trainer extends Pengguna {
    private int idTrainer;
    private String spesialisasi;
    private double gajiPerJam;
    private double rating;

    public int getIdTrainer() {
        return idTrainer;
    }

    public void setIdTrainer(int idTrainer) {
        this.idTrainer = idTrainer;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public double getGajiPerJam() {
        return gajiPerJam;
    }

    public void setGajiPerJam(double gajiPerJam) {
        this.gajiPerJam = gajiPerJam;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String tampilInfo() {
        return "Trainer: " + nama + " - " + spesialisasi;
    }
}