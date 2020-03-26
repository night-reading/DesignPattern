package single_lazy

import "sync"

type Single struct {
}

var s *Single
var mu sync.Mutex

func GetSingle() *Single {

	//线程非安全 加锁
	//缺点:每次调用都会加锁,
	mu.Lock()
	defer mu.Unlock()
	if s == nil {
		s = new(Single)
		return s
	}
	return s
}

/**
	对于锁的优化
 */
func GetOptimizeSingle() *Single {

	//线程非安全 加锁  避免每次调用都加锁

	if s == nil {
		mu.Lock()
		defer mu.Unlock()
		if s == nil {
			s = new(Single)
			return s
		}
	}
	return s
}
