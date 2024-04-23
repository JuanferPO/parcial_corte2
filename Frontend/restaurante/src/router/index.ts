import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';
import Ingreso from '../views/Ingreso.vue'
import Factura from '../views/Factura.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    redirect: '/save'
  },
  {
    path: '/save',
    name: 'Ingresar datos',
    component: Ingreso
  },
  {
    path: '/find',
    name: 'Factura',
    component: Factura
  }
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
})

export default router
