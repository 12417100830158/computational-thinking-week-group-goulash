def solution_station_7(expr: str) -> float:
    variables = {
        "a": 3,
        "b": -1,
        "c": 4,
        "d": 7,
        "e": 0.5
    }
    return eval(expr, {}, variables)
