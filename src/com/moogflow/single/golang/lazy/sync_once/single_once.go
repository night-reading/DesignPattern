package sync_once

import (
	"sync"
)

type Single struct {
}
var once sync.Once
var s *Single
func GetSingle ()*Single  {

	once.Do(func() {
		s =new(Single)
	})
	return  s
}

