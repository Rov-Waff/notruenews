<script setup lang="ts">
import { ref } from 'vue'
import type { News } from '@/types';
const NewsSource = ref<Array<News>>([{ id: 1, title: 'FFFF', content: 'FFFFF' }])
</script>

<template>
  <li v-for="item in NewsSource" :key="item.id">
    <RouterLink :to="{path:'/article',query:{id:item.id}}">{{ item.title }}</RouterLink>
  </li>
</template>

<style scoped></style>
