<script setup lang="ts">
import { ref } from 'vue'
import type { News } from '@/types'
import axios from 'axios'
import { useRouter } from 'vue-router'
const NewsSource = ref<Array<News>>()
const router = useRouter()
const getNews = () => {
  axios({
    url: 'http://localhost/api/getAllNews',
    method: 'GET',
  })
    .then((res) => {
      NewsSource.value = res.data
    })
    .catch((err) => {
      router.push(`/err?errType=${err}`)
    })
}
getNews()
</script>

<template>
  <li v-for="item in NewsSource" :key="item.id">
    <RouterLink :to="{ path: '/article', query: { id: item.id } }">{{ item.title }}</RouterLink>
  </li>
</template>

<style scoped></style>
