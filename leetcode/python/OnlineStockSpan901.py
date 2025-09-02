class StockSpanner(object):

    def __init__(self):
        self.stack = []

    def next(self, price):
        """
        :type price: int
        :rtype: int
        """
        span = 1

        while self.stack:
            top_price, top_span = self.stack[-1]

            if top_price <= price:
                span += top_span
                self.stack.pop()
            else:
                break
        
        self.stack.append((price, span))
        return span