import { createRouter, createWebHistory } from 'vue-router'
// import Vue from 'vue'
// import VueRouter from 'vue-router'
import Login from '@/views/Login'
import Show from '@/views/Show'
import Zhuye from '@/views/Zhuye'
import Add from '@/views/Add'
const routes = [

  {
    name: "Login",
    path: '/',
    component: Login
  },

  {
    name: 'Zhuye',
    path: "/Zhuye",
    component: Zhuye,
    children: [
      {
        name: "Show",
        path: '/Show',
        component: Show
      },
      {
        name: "Add",
        path: '/Add',
        component: Add
      },
    ]
  }


]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
