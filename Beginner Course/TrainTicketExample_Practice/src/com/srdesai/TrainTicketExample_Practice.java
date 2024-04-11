package com.srdesai;

import java.time.LocalDateTime;

public class TrainTicketExample_Practice {
    public static void main(String[] args) {
        TrainTicket indiaTrainTicket = new TrainTicket("IN1234", "India", LocalDateTime.of(2024, 4, 15, 10, 0), "Mumbai", "Delhi");
        TrainTicket franceTrainTicket = new TrainTicket("FR5678", "France", LocalDateTime.of(2024, 5, 20, 15, 30), "Paris", "Lyon");

        System.out.println("Ticket ID: " + indiaTrainTicket.getTicketId() + ", Country: " + indiaTrainTicket.getCountry()
                + ", Departure: " + indiaTrainTicket.getDepartureTime() + ", From: " + indiaTrainTicket.getFromCity()
                + ", To: " + indiaTrainTicket.getToCity());

        System.out.println("Ticket ID: " + franceTrainTicket.getTicketId() + ", Country: " + franceTrainTicket.getCountry()
                + ", Departure: " + franceTrainTicket.getDepartureTime() + ", From: " + franceTrainTicket.getFromCity()
                + ", To: " + franceTrainTicket.getToCity());
    }

    static class TrainTicket {
        private String ticketId;
        private String country;
        private LocalDateTime departureTime;
        private String fromCity;
        private String toCity;

        TrainTicket(String ticketId, String country, LocalDateTime departureTime, String fromCity, String toCity) {
            this.ticketId = ticketId;
            this.country = country;
            this.departureTime = departureTime;
            this.fromCity = fromCity;
            this.toCity = toCity;
        }

        public String getTicketId() {
            return ticketId;
        }

        public String getCountry() {
            return country;
        }

        public LocalDateTime getDepartureTime() {
            return departureTime;
        }

        public String getFromCity() {
            return fromCity;
        }

        public String getToCity() {
            return toCity;
        }
    }
}
