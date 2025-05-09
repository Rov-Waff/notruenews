<template>
  <h2 id="title">{{ News.title }}</h2>
  <hr>
  <p>{{ News.content }}</p>
  <hr>
  <RouterLink to="/"><-回到列表</RouterLink>

</template>

<script setup lang="ts">
import type { News } from '@/types';
import { ref } from 'vue';

const News = ref<News>({ id: 1, title: 'FFFF', content: 'FFFFF' })

</script>

<style lang="css" scoped>
#title{
  text-align: center;
}
</style>
