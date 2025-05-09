<template>
  <h2 id="title">{{ News.title }}</h2>
  <hr />
  <p>{{ News.content }}</p>
  <hr />
  <RouterLink to="/"><-回到列表</RouterLink>
</template>

<script setup lang="ts">
import type { News } from '@/types'
import axios from 'axios'
import { ref } from 'vue'
import { useRoute, useRouter } from 'vue-router'

const News = ref<News>({ id: 0, title: '', content: '' })
const route = useRoute()
const router = useRouter()
const getNews = () => {
  axios({
    url: `http://localhost/api/getNewsById?id=${route.query.id}`,
    method: 'GET',
  })
    .then((res) => {
      News.value = res.data
    })
    .catch((err) => {
      router.push(`/err?errType=${err}`)
    })
}
getNews()
</script>

<style lang="css" scoped>
#title {
  text-align: center;
}
</style>
