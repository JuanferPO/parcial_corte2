<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Factura</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-label>
          <ion-title size="large">Factura</ion-title>
        </ion-label>
      </ion-header>

      <ion-item>
        <ion-label>
          <h2>Factura No. 1234</h2>
          <p>Cliente: Juan Pérez</p>
          <p>Fecha: 23-04-2024</p>
        </ion-label>
      </ion-item>
      <ion-grid>
        <ion-row>
          <ion-col size="3">
            <h3>Producto</h3>
          </ion-col>
          <ion-col size="3">
            <h3>Valor unitario</h3>
          </ion-col>
          <ion-col size="3">
            <h3>Cantidad</h3>
          </ion-col>
          <ion-col size="3">
            <h3>Valor total</h3>
          </ion-col>
        </ion-row>
        <ion-row>
          <ion-col size="3">
            <p>Hamburguesa simple</p>
          </ion-col>
          <ion-col size="3">
            <p>10000</p>
          </ion-col>
          <ion-col size="3">
            <p>3</p>
          </ion-col>
          <ion-col size="3">
            <p>30000</p>
          </ion-col>
        </ion-row>
        <ion-row>
          <ion-col size="3">
            <p>Gaseosa 1,5 L</p>
          </ion-col>
          <ion-col size="3">
            <p>6000</p>
          </ion-col>
          <ion-col size="3">
            <p>1</p>
          </ion-col>
          <ion-col size="3">
            <p>6000</p>
          </ion-col>
        </ion-row>
        <ion-row>
          <ion-col size="3">
            <p>Papas fritas</p>
          </ion-col>
          <ion-col size="3">
            <p>3000</p>
          </ion-col>
          <ion-col size="3">
            <p>2</p>
          </ion-col>
          <ion-col size="3">
            <p>6000</p>
          </ion-col>
        </ion-row>
        <ion-row>
          <ion-col size="3">
            <h3>Total</h3>
          </ion-col>
          <ion-col size="3">
          </ion-col>
          <ion-col size="3">
          </ion-col>
          <ion-col size="3">
            <h3>42000</h3>
          </ion-col>
        </ion-row>
      </ion-grid>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
</script>

<style scoped>
#container {
  text-align: center;
  
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  transform: translateY(-50%);
}

#container strong {
  font-size: 20px;
  line-height: 26px;
}

#container p {
  font-size: 16px;
  line-height: 22px;
  
  color: #8c8c8c;
  
  margin: 0;
}

#container a {
  text-decoration: none;
}
</style>
