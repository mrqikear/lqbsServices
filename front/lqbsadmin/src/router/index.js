import Vue from 'vue'
import VueRouter from 'vue-router'


Vue.use(VueRouter)

const routes = [
  { path: '/', name: 'home', meta: { title: '首页', nav: true }, component: () => import('../views/Home.vue') },
  { path: '/login', name: 'login', meta: { title: '', nav: false }, component: () => import('../views/Login.vue') },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
