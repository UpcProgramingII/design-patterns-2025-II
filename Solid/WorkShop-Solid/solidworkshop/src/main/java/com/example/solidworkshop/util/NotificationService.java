package com.example.solidworkshop.util;

/**
 * Servicio de notificaciones muy simple — implementado como clase concreta.
 * - Violación DIP: los clientes deberían depender de abstracciones, no de esta clase concreta.
 */
public class NotificationService {
    public void send(String message) {
        // Simula envío (imprime en consola)
        System.out.println("[NOTIFICATION] " + message);
    }
}
