<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Agregar producto</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Agregar producto</ion-title>
        </ion-toolbar>
      </ion-header>

      <ion-item>
        <ion-label>
          <h2>Pedido No. 1234</h2>
          <p>Cliente: Juan Pérez</p>
          <p>Fecha: 23-04-2024</p>
        </ion-label>
      </ion-item>
      <ion-grid>
        <ion-row class="ion-justify-content-center">
          <ion-col size="auto">
            <ion-select label="Producto" placeholder="Seleccionar...">
              <ion-select-option value="hamburguesa-sencilla">Hamburguesa sencilla</ion-select-option>
              <ion-select-option value="hamburguesa-doble">Hamburguesa doble</ion-select-option>
              <ion-select-option value="hamburguesa-queso">Hamburguesa de queso</ion-select-option>
              <ion-select-option value="papas-francesa">Papas a la francesa</ion-select-option>
              <ion-select-option value="gaseosa-personal">Gaseosa personal</ion-select-option>
              <ion-select-option value="gaseosa-1.5">Gaseosa 1.5 L</ion-select-option>
            </ion-select>
            <ion-input label="Cantidad" type="number" placeholder="Ingrese la cantidad comprada del producto"></ion-input>
          </ion-col>
        </ion-row>
      </ion-grid>
      <ion-grid>
        <ion-row class="ion-justify-content-center">
          <ion-col size="auto">
            <ion-button>Agregar al pedido</ion-button>
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
