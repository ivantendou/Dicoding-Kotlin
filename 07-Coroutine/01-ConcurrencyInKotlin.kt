// 01 - Concurrency

/* 
  Concurrency is several processes that occur simultaneously in a system. 
  Concurrency is a natural phenomenon that commonly occurs. Just like in the real world, many activities are carried out at the same time. 
  Thus, when we want to develop a system to help with real activities, of course we have to care about concurrency.

  Concurrency is not parallelism.

  Concurrency occurs when there are 2 (two) or more processes that overlap at one time. 
  This can happen if there are 2 (two) or more threads currently active. And if the thread is run by a computer that only has 1 (one) core,
  all threads will not run in parallel. Concurrency allows a computer that only has 1 (one) core to appear as if it is doing many tasks at once.
  In fact, these tasks are carried out alternately.
  
  Meanwhile, parallelism occurs when 2 (two) processes running at the same point in time persist. 
  Parallelism can be done if there are 2 (two) or more threads and the computer also has 2 (two) or more cores.
  So that each core can execute commands from each thread simultaneously.
*/
