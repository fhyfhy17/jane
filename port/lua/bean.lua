-- UTF-8 without BOM
-- This file is generated by genbeans tool. Do NOT edit it!

local num, str, bool, vec, map = 0, 1, 2, 3, 4
return require "util".initbeans {
	TestBean = { __type = 1, __vars = {
		[ 1] = { name = "value1", type = num },
		[ 2] = { name = "value2", type = num },
	}},
	TestKeyBean = { __type = 2, __vars = {
		[ 1] = { name = "key1", type = num },
		[ 2] = { name = "key2", type = str },
	}},
	TestType = { __type = 3, __vars = {
		[ 1] = { name = "v1", type = bool },
		[ 2] = { name = "v2", type = num },
		[ 3] = { name = "v3", type = num },
		[ 4] = { name = "v4", type = num },
		[ 5] = { name = "v5", type = num },
		[ 6] = { name = "v6", type = num },
		[ 7] = { name = "v7", type = num },
		[ 8] = { name = "v8", type = str },
		[ 9] = { name = "v9", type = str },
		[10] = { name = "v10", type = vec, value = bool },
		[11] = { name = "v11", type = vec, value = num },
		[12] = { name = "v12", type = vec, value = num },
		[13] = { name = "v13", type = vec, value = num },
		[14] = { name = "v14", type = vec, value = num },
		[15] = { name = "v15", type = vec, value = num },
		[16] = { name = "v16", type = map, key = num, value = str },
		[17] = { name = "v17", type = map, key = "TestBean", value = bool },
		[18] = { name = "v18", type = map, key = str, value = "TestBean" },
		[19] = { name = "v19", type = "TestBean" },
	}},
	TestEmpty = { __type = 4, __vars = {
	}},
}
