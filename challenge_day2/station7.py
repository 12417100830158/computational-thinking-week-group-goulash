def solution_station_7(expr: str) -> float:
    variables = {
        "a": 3.0,
        "b": -1.0,
        "c": 4.0,
        "d": 7.0,
        "e": 0.5
    }
    return eval(expr, {}, variables)