import ArticleView from '@/views/ArticleView.vue'
import ErrView from '@/views/ErrView.vue'
import ListView from '@/views/ListView.vue'
import PostNewsView from '@/views/PostNewsView.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'list',
      component: ListView,
    },
    {
      path: '/article',
      name: 'article',
      component: ArticleView,
    },
    {
      path: '/post',
      name: 'post',
      component: PostNewsView,
    },
    {
      path: '/err',
      name: 'errpage',
      component: ErrView,
    },
  ],
})

export default router
