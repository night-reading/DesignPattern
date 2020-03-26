package single_eager

type Single struct {
}

var s  = new(Single)

func GetSingle() *Single {
	return s
}
