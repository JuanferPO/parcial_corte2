import { createRouter, createWebHistory } from '@ionic/vue-router';
import { RouteRecordRaw } from 'vue-router';
import Ingreso from '../views/Ingreso.vue'
import Pedido from '../views/Pedido.vue'

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
    component: Pedido
  }
]

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes
})

export default router
